package carlosbernal.drinker.core.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import carlosbernal.drinker.HomeScreen
import carlosbernal.drinker.LoginScreen
import carlosbernal.drinker.RegisterScreen

@Composable
fun NavigationWrapper() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Login) {
        composable<Login> {
            LoginScreen({ navController.navigate(Register) }, { navController.navigate(Register) })
        }
        composable<Register> {
            RegisterScreen({ navController.navigate((Login)) })
        }
        composable<Home> {
            HomeScreen()
        }
    }
}