package yuri.garcia.entrenamientopokemon_252583_252801_253080

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import yuri.garcia.entrenamientopokemon_252583_252801_253080.navigation.AppNavigator
import yuri.garcia.entrenamientopokemon_252583_252801_253080.ui.theme.EntrenamientoPokemon_252583_252801_253080Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EntrenamientoPokemon_252583_252801_253080Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppNavigator()
                }
            }
        }
    }
}
