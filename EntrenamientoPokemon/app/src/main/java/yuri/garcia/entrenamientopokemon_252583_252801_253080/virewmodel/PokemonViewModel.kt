
class PokemonViewModel : ViewModel(){

    var probabilidadSubirNivel by mutableStateOf<listOf<Int>(100)


    private val pokemonDisponibles = listOf(
        Pokemon("Pikachu", "Electric"),
        Pokemon("Charmander", "Fire"),
        Pokemon("Squirtle", "Water"),
        Pokemon("Bulbasaur", "Grass"),
        Pokemon("Jigglypuff", "Fairy"),
        Pokemon("Gengar", "Ghost")

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
        pokemonSalvaje?.let {
            val success = (0..100).random()

            if(success > 50){
                capturados = capturados + it
                seFue = false
            } else{
                seFue = true
            }

            pokemonSalvaje = null

        }

    }


}