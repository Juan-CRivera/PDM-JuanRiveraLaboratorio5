package com.example.laboratorio_5

import android.app.Application
import androidx.room.Room
import com.example.laboratorio_5.Model.AppDatabase

class InitDatabase : Application() {
    companion object {
        lateinit var database: AppDatabase
            private set
    }

    override fun onCreate() {
        super.onCreate()
        database = Room.databaseBuilder(
            this,
            AppDatabase::class.java,
            "TaskDatabase"
        )
            .fallbackToDestructiveMigration()
            .build()
    }
}