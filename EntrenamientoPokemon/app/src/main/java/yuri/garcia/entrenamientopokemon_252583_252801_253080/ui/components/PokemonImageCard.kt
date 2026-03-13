package yuri.garcia.entrenamientopokemon_252583_252801_253080.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import yuri.garcia.entrenamientopokemon_252583_252801_253080.R
import yuri.garcia.entrenamientopokemon_252583_252801_253080.data.models.Pokemon

@Composable
fun PokemonImageCard(pokemon: Pokemon) {
    Column(
        modifier = Modifier
            .width(250.dp)
            .height(285.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = pokemon.name,
                style = MaterialTheme.typography.titleLarge)
            Spacer(modifier = Modifier.width(10.dp))
            Text(text = "N.${pokemon.numPkdx}",
                style = MaterialTheme.typography.titleLarge)
        }
        Spacer(modifier = Modifier.height(12.dp))
        Card(
            modifier = Modifier
                .width(240.dp)
                .height(240.dp),
            elevation = CardDefaults.cardElevation(8.dp),
            colors = CardDefaults.cardColors(
                containerColor = colorResource(R.color.gray)
            )
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(pokemon.imageRes),
                    contentDescription = "img${pokemon.name}",
                    contentScale = ContentScale.Fit,
                    modifier = Modifier.size(200.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PokemonImageCardPreview(){
    PokemonImageCard(
        Pokemon("Zeraora", 50, 807, "Eléctrico", 1.5, 44.5,
            "Las almohadillas de sus patas desprenden descargas eléctricas. Cuando corre, hace que los rayos caigan y que los truenos resuenen.",
            R.drawable.zeraora
        )
    )
}