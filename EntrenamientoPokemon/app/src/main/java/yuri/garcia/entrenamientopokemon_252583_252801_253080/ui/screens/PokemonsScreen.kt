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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import yuri.garcia.entrenamientopokemon_252583_252801_253080.R
import yuri.garcia.entrenamientopokemon_252583_252801_253080.viewmodel.PokemonViewModel

/**
 * Manuel Romo López - 253080
 * Daniel Miramontes Iribe - 252801
 * Yuri Germán García López - 252583
 */

@Composable
fun PokemonsScreen(
    onPokemon: (numPkdx: Int) -> Unit,
    viewModel: PokemonViewModel = viewModel()
){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .padding(bottom = 35.dp)
    ) {
        Spacer(modifier = Modifier.height(30.dp))
        Text(text = stringResource(R.string.list_label),
            style = MaterialTheme.typography.headlineLarge,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(20.dp))

        // Lista dinámica de pokémons
        LazyColumn() {
            items(items = viewModel.capturados){

                PokemonCard(
                    pokemon = it,
                    onCardClick = {
                        viewModel.limpiarMensaje()
                        onPokemon(it.numPkdx)
                    }
                )
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun PokemonsScreenPreview(){
    PokemonsScreen({}, viewModel())
}