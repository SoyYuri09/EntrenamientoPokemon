package yuri.garcia.entrenamientopokemon_252583_252801_253080.virewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import yuri.garcia.entrenamientopokemon_252583_252801_253080.R
import yuri.garcia.entrenamientopokemon_252583_252801_253080.data.models.Pokemon

    class PokemonViewModel : ViewModel(){

    //var probabilidadSubirNivel by mutableStateOf<listOf<Int>(100)

    private val pokemonDisponibles = listOf(
        Pokemon("Zeraora", 50, 807, "Eléctrico", 1.5, 44.5,
            "Las almohadillas de sus patas desprenden descargas eléctricas. Cuando corre, hace que los rayos caigan y que los truenos resuenen.",
            R.drawable.zeraora
        ),
        Pokemon("Sprigatito", 45,906, "Planta", 0.4, 4.1,
            "Su sedoso pelaje se asemeja en composición a las plantas. Se lava la cara con diligencia para que no se le seque.",
            R.drawable.sprigatito
        ),
        Pokemon("Meowscarada", 63, 908, "Planta / Siniestro", 1.5, 31.2,
            "Después de desviar hábilmente la atención del oponente, le lanza sus bombas florales rellenas de polen y las hace estallar sin que se dé cuenta.",
            R.drawable.meowscarada
        ),
        Pokemon("Riolu", 15, 447, "Lucha", 0.7, 20.2,
            "Se comunica con los suyos emitiendo ondas. Puede pasarse toda una noche corriendo.",
            R.drawable.riolu
        ),
        Pokemon("Lucario", 36, 448, "Lucha / Acero", 1.2, 54.0,
            "Puede percibir el aura de aquello que lo rodea. Es capaz de percibir las emociones de otros incluso a 1 km de distancia.",
            R.drawable.lucario
        )
    )

        var mensajeSubeNivel by mutableStateOf("")

    fun entrenar(numPkdxRecv: Int){

        var pokemon = pokemonDisponibles.find { it.numPkdx == numPkdxRecv }

        pokemon?.let {

            var porcentajeSubirNivel = 100 - it.level + 1

            var subeNivel = (0..100)
                .random()

            if(subeNivel >= porcentajeSubirNivel){

                mensajeSubeNivel = "El entrenamiento falló"
            } else{

                it.level += 1
                mensajeSubeNivel = "Subió de nivel, ${it.level}"

            }
        }


    }


}