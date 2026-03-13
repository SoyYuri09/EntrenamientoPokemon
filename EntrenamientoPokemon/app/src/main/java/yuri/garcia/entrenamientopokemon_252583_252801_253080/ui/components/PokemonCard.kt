import android.R.attr.onClick
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import yuri.garcia.entrenamientopokemon_252583_252801_253080.R
import yuri.garcia.entrenamientopokemon_252583_252801_253080.data.models.Pokemon

@Composable
fun PokemonCard(
    pokemon: Pokemon
){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp)
            .clickable{},
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(12.dp)
        ) {
            Image(
                painter = painterResource(pokemon.imageRes),
                contentDescription = "img$pokemon.id",
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .size(90.dp)
            )
            Spacer(modifier = Modifier.width(12.dp))

            Column() {
                Row() {
                    Text(text = pokemon.name,
                        style = MaterialTheme.typography.titleLarge
                    )
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(text = "N." + pokemon.numPkdx.toString(),
                        style = MaterialTheme.typography.titleLarge
                    )
                }
                Spacer(modifier = Modifier.height(9.dp))
                Text(text = "Tipo: " + pokemon.type)

                Spacer(modifier = Modifier.height(2.dp))
                Text(text = "Altura: " + pokemon.height + " m")

                Spacer(modifier = Modifier.height(2.dp))
                Text(text = "Peso: " + pokemon.weight + " kg")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PokemonCardPreview() {
    PokemonCard(Pokemon("Zeraora", 50, 807, "Eléctrico", 1.5, 44.5,
        "Las almohadillas de sus patas desprenden descargas eléctricas. Cuando corre, hace que los rayos caigan y que los truenos resuenen.",
        R.drawable.zeraora
    ))
}