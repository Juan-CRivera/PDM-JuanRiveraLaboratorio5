package com.example.laboratorio_5.mainnavigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.laboratorio_5.view.TaskScreen
import com.example.laboratorio_5.ViewModel.GeneralViewModel

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    val viewModel: GeneralViewModel = viewModel()

    NavHost(navController = navController, startDestination = "task_screen") {
        composable("task_screen") {
            TaskScreen(viewModel = viewModel)
        }
    }
}