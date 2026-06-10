package com.example.laboratorio_5.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.laboratorio_5.InitDatabase
import com.example.laboratorio_5.Model.Task
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class GeneralViewModel : ViewModel() {


    private val taskDao = InitDatabase.database.taskDao()


    val tasks = taskDao.getAllTasks().stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000),
        initialValue = emptyList()
    )

    fun addTask(title: String, description: String) {
        viewModelScope.launch {
            val newTask = Task(title = title, description = description)
            taskDao.insertTask(newTask)
        }
    }
}