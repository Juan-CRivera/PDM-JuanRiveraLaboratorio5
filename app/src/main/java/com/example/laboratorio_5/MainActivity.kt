package com.example.laboratorio_5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.laboratorio_5.mainnavigation.AppNavigation
import com.example.laboratorio_5.ui.theme.Laboratorio_5MVVMTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Laboratorio_5MVVMTheme(){
                AppNavigation()
            }
        }
    }
}