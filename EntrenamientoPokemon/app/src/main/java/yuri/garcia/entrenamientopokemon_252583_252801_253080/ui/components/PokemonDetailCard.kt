import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import yuri.garcia.entrenamientopokemon_252583_252801_253080.R
import yuri.garcia.entrenamientopokemon_252583_252801_253080.data.models.Pokemon

@Composable
fun PokemonDetailCard(pokemon: Pokemon) {
    Column(
        modifier = Modifier.padding(12.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            modifier = Modifier
                .width(240.dp)
                .height(240.dp)
                .padding(bottom = 8.dp),
            elevation = CardDefaults.cardElevation(6.dp),
            colors = CardDefaults.cardColors(
                containerColor = colorResource(R.color.white)
            )
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = pokemon.description,
                    color = colorResource(R.color.black),
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(12.dp)
                )
            }
        }
        Card(
            modifier = Modifier
                .width(240.dp)
                .height(170.dp),
            elevation = CardDefaults.cardElevation(8.dp),
            colors = CardDefaults.cardColors(
                containerColor = colorResource(R.color.blue)
            )
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Row(horizontalArrangement = Arrangement.Center) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Text(
                                text = "Altura:",
                                color = colorResource(R.color.white)
                            )
                            Spacer(modifier = Modifier.height(2.dp))
                            Text(text = "${pokemon.height} m")
                        }
                        Spacer(modifier = Modifier.width(26.dp))
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Text(
                                text = "Peso:",
                                color = colorResource(R.color.white)
                            )
                            Spacer(modifier = Modifier.height(2.dp))
                            Text(text = "${pokemon.weight} kg")
                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            text = "Tipo:",
                            color = colorResource(R.color.white)
                        )
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(text = pokemon.type)
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PokemonDetailCardPreview(){
    PokemonDetailCard(
        Pokemon("Zeraora", 50, 807, "Eléctrico", 1.5, 44.5,
            "Las almohadillas de sus patas desprenden descargas eléctricas. Cuando corre, hace que los rayos caigan y que los truenos resuenen.",
            R.drawable.zeraora
        )
    )
}