package yuri.garcia.entrenamientopokemon_252583_252801_253080.virewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import yuri.garcia.entrenamientopokemon_252583_252801_253080.data.models.Pokemon

    class PokemonViewModel : ViewModel(){

    //var probabilidadSubirNivel by mutableStateOf<listOf<Int>(100)

    private val pokemonDisponibles = listOf(
        Pokemon("Zeraora", 50, 807, "Eléctrico", 1.5, 44.5,
            "Las almohadillas de sus patas desprenden descargas eléctricas. Cuando corre, hace que los rayos caigan y que los truenos resuenen.", ),
    )

    // ? Significa que es "nulleable"
    var pokemonSalvaje by mutableStateOf<Pokemon?>(null)
        private set

    var capturados by mutableStateOf(listOf<Pokemon>())
        private set

    // Aqui es donde se llamaria a una API, o cualquier otro medio para obtener información.
    fun buscarEnLaHierba(){
        pokemonSalvaje = pokemonDisponibles.random()
    }

    fun capturar(){

        // .let hace la ejecución de lo que esta dentro de las llaves, solo si no es nulo (es una validación
        // nulidad).
        // ? Es para evitar que si fuese nulo, la variable pueda almacenarlo.
//        pokemonSalvaje?.let {
//            val success = (0..100).random()
//
//            if(success > 50){
//                capturados = capturados + it
//                seFue = false
//            } else{
//                seFue = true
//            }
//
//            pokemonSalvaje = null
//
//        }

    }


}