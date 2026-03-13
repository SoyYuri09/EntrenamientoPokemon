import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PokemonsScreen(
    onDetailSucces: () -> Unit
){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Spacer(modifier = Modifier.height(30.dp))
        Text(text = "Listado de Pokémons",
            style = MaterialTheme.typography.headlineLarge,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(20.dp))

//        LazyColumn() { //Lista dinámica de pokémons
//            items(items = samplePokemon){
//                    pokemon ->
//                PokemonCard(
//                    pokemon = pokemon,
//                    onClick = {
//                        selectedPokemon = pokemon
//                        onDetailSucces()
//                    }
//                )
//            }
//        }
    }
}

@Preview(showBackground = true)
@Composable
fun PokemonsScreenPreview(){
    PokemonsScreen({})
}