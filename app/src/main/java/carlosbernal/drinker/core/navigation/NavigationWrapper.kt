package carlosbernal.drinker.core.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import carlosbernal.drinker.LoginScreen

@Composable
fun NavigationWrapper(){
     val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Login) {
        composable<Login> {
            LoginScreen()
        }
    }
}