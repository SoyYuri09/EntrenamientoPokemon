package yuri.garcia.entrenamientopokemon_252583_252801_253080.data.models

data class Pokemon(
    val name: String,
    val level: Int,
    val numPkdx: Int,
    val type: String,
    val height: Double,
    val weight: Double,
    val description: String,
    val imageRes: Int = 0
)