package com.pathak.cleancodearchitecturedemo1.presentation.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.pathak.cleancodearchitecturedemo1.presentation.view.composables.DogScreen
import com.pathak.cleancodearchitecturedemo1.presentation.view.theme.CleanCodeArchitectureDemo1Theme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CleanCodeArchitectureDemo1Theme {
                DogScreen()
            }
        }
    }
}
