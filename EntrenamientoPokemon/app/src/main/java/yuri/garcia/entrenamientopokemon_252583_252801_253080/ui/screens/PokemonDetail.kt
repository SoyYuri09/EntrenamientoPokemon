package yuri.garcia.entrenamientopokemon_252583_252801_253080.ui.screens

import PokemonDetailCard
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import yuri.garcia.entrenamientopokemon_252583_252801_253080.R
import yuri.garcia.entrenamientopokemon_252583_252801_253080.data.models.Pokemon
import yuri.garcia.entrenamientopokemon_252583_252801_253080.ui.components.PokemonImageCard
import yuri.garcia.entrenamientopokemon_252583_252801_253080.viewmodel.PokemonViewModel

/**
 * Manuel Romo López - 253080
 * Daniel Miramontes Iribe - 252801
 * Yuri Germán García López - 252583
 */

@Composable
fun PokemonDetail(
    pokemon: Pokemon,
    viewModel: PokemonViewModel
){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .padding(top = 30.dp, bottom = 35.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        PokemonImageCard(pokemon)
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = stringResource(R.string.level_label, pokemon.level),
            style = MaterialTheme.typography.headlineSmall
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button (
            onClick = {
                viewModel.entrenar(pokemon.numPkdx)
            }
        ){
            Text(text = stringResource(R.string.train_label))
        }
        Spacer(modifier = Modifier.height(16.dp))

        if(viewModel.mensajeSubeNivel != null){
            Text(text = viewModel.mensajeSubeNivel!!)
        }

        PokemonDetailCard(pokemon)

    }


}

@Preview(showBackground = true)
@Composable
fun PokemonDetailPreview(){
    PokemonDetail(
        pokemon = Pokemon(
            "Riolu", 15, 447, "Lucha", 0.7, 20.2,
            "Se comunica con los suyos emitiendo ondas. Puede pasarse toda una noche corriendo.",
            R.drawable.riolu
        ),
        viewModel = viewModel()
    )
}