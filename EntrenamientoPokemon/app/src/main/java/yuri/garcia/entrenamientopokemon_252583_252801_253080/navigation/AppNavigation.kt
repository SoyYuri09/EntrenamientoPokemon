
package yuri.garcia.entrenamientopokemon_252583_252801_253080.navigation

import PokemonsScreen
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import yuri.garcia.entrenamientopokemon_252583_252801_253080.ui.screens.LoginScreen
import yuri.garcia.entrenamientopokemon_252583_252801_253080.ui.screens.PokemonDetail
import yuri.garcia.entrenamientopokemon_252583_252801_253080.viewmodel.PokemonViewModel

/**
 * Manuel Romo López - 253080
 * Daniel Miramontes Iribe - 252801
 * Yuri Germán García López - 252583
 */

@Composable
fun AppNavigator(){

    val navController = rememberNavController()
    val viewModel: PokemonViewModel = viewModel()

    NavHost(navController = navController, startDestination = Routes.LOGIN_SCREEN){
        composable(Routes.LOGIN_SCREEN){
            LoginScreen(
                onLoginSuccess = {navController.navigate(Routes.LIST_SCREEN)}
            )
        }

        composable(Routes.LIST_SCREEN){

            PokemonsScreen(
                onPokemon = {pokemonNumPkdx -> navController.navigate("detail/$pokemonNumPkdx")},
                viewModel = viewModel
            )
        }

        composable(
            route = Routes.DETAIL_SCREEN,
            arguments = listOf(navArgument("pokemonNumPkdx") {type = NavType.IntType})
        ){
            val pokemonNumPkdx = it.arguments?.getInt("pokemonNumPkdx")

            if (pokemonNumPkdx != null) {
                PokemonDetail(
                    numPkdx = pokemonNumPkdx,
                    viewModel = viewModel)
            }
        }


    }

}

object Routes{
    const val LOGIN_SCREEN = "login"
    const val LIST_SCREEN = "list"
    const val DETAIL_SCREEN ="detail/{pokemonNumPkdx}"
}