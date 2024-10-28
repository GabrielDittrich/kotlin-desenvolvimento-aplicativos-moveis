package com.positivo.roomcomcompose

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.positivo.roomcomcompose.telas.TelaDetalhes
import com.positivo.roomcomcompose.telas.TelaMenu

@Composable
fun LivroNavigation() {

    val navController = rememberNavController()

    NavHost(navController, startDestination = "menu" ){
        composable("menu") {
            // tela menu
            TelaMenu(navController)
        }
        composable ("detalhes/{nomeLivro}"){
            // detalhes livro
            val nomeLivro = it.arguments?.getString("nomeLivro")
            TelaDetalhes(navController, nomeLivro)
        }
    }
}