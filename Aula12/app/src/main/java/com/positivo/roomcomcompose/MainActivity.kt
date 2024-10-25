package com.positivo.roomcomcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.positivo.roomcomcompose.data.Livro
import com.positivo.roomcomcompose.ui.theme.RoomComComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}

@Composable
fun GreetingPreview() {
    RoomComComposeTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            shape = RoundedCornerShape(10.dp),
            shadowElevation = 10.dp,
            border = BorderStroke(0.1.dp, Color.LightGray),
        )
        {
            var livros = listOf(
                Livro(0, "O Senhor dos Aneis", "1954"),
                Livro(1, "1984", "1954"),
                Livro(2, "Don Quixote", "1685")
            )
            ListaDeLivro(livros)
        }
    }
}

@Composable
fun ListaDeLivro(livros: List<Livro>){
    LazyColumn {
        items(livros) { livro ->
            CardLivro(livro)
        }
    }
}

@Composable
fun CardLivro(livro: Livro) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Column(modifier = Modifier.padding(6.dp)) {
            Text(text = "Id: ${livro.id}", style = MaterialTheme.typography.bodySmall)
            Text(
                text = "Nome: ${livro.nome}",
                style = MaterialTheme.typography.headlineLarge
            )
            Text(text = "Ano: ${livro.ano}", style = MaterialTheme.typography.bodyMedium)
        }
    }
}