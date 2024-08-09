package com.pathak.cleancodearchitecturedemo1.presentation.view.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.rememberAsyncImagePainter
import coil.compose.rememberImagePainter
import com.pathak.cleancodearchitecturedemo1.presentation.viewmodel.DogViewModel

@Composable
fun DogScreen() {
    val viewModel: DogViewModel = hiltViewModel()
    val response = viewModel.dogInfo

    Column {
        if (response?.urlOfDogImage?.isNotEmpty() == true) {

            Image(
                painter = rememberAsyncImagePainter(model = response.urlOfDogImage),
                contentDescription = "",
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxSize(0.5f),
                contentScale = ContentScale.Crop
            )
        }

        Button(onClick = { viewModel.fetchRandomDog() }) {
            Text(text = "Get Dog Image")
        }
    }
}