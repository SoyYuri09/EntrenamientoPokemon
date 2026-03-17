package yuri.garcia.entrenamientopokemon_252583_252801_253080.data.models

/**
 * Manuel Romo López - 253080
 * Daniel Miramontes Iribe - 252801
 * Yuri Germán García López - 252583
 */

data class Pokemon(
    val name: String,
    var level: Int,
    val numPkdx: Int,
    val type: String,
    val height: Double,
    val weight: Double,
    val description: String,
    val imageRes: Int = 0
)