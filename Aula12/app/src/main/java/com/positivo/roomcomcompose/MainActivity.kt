package com.positivo.roomcomcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.positivo.roomcomcompose.data.Livro
import com.positivo.roomcomcompose.data.LivroDatabase
import com.positivo.roomcomcompose.ui.theme.RoomComComposeTheme
import kotlin.coroutines.coroutineContext

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
        GreetingPreview()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun InputNovoLivro() {
   // coroutineContext.launch {
        var nome by remember { mutableStateOf("") }
        var ano by remember { mutableStateOf("") }
   //}
    Column (modifier = Modifier.padding(28.dp)){

        Text(text = "Novo Livro", fontSize = 30.sp)

        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            OutlinedTextField(value = "Nome",
                onValueChange = { nome = it },
                label = { Text("Nome") })

            OutlinedTextField(value = "Ano",
                onValueChange = { ano = it },
                label = { Text("Ano") })
        }
        Button(onClick = {
            val novoLivro = Livro(0,nome,ano)
            val contexto = LocalContext.current

            LivroDatabase.getDatabase(contexto).livroDao().addLivro(novoLivro)

        }) {
            Text(text = "Criar Livro")

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