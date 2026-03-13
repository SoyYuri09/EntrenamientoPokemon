package yuri.garcia.entrenamientopokemon_252583_252801_253080.ui.screens

import PokemonDetailCard
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.selects.select
import yuri.garcia.entrenamientopokemon_252583_252801_253080.ui.components.PokemonImageCard
import yuri.garcia.practica4_garciayuri.model.samplePokemon
import yuri.garcia.practica4_garciayuri.model.selectedPokemon
import yuri.garcia.practica4_garciayuri.ui.components.PokemonCard
import yuri.garcia.practica4_garciayuri.ui.components.PokemonDetailCard
import yuri.garcia.practica4_garciayuri.ui.components.PokemonImageCard

@Composable
fun PokemonDetail(){

    val pokemon = selectedPokemon

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if(pokemon != null){
            PokemonImageCard(pokemon)
            Spacer(modifier = Modifier.height(16.dp))
            PokemonDetailCard(pokemon)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PokemonDetailPreview(){
    PokemonDetail()
}