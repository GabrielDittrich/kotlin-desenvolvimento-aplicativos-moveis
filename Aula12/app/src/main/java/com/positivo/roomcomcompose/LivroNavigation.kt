package com.positivo.roomcomcompose

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun LivroNavigation() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = "nome" ){
        composable("home") {
            // home
        }
        composable ("detalhes"){
            // detalhes livro

        }
    }
}