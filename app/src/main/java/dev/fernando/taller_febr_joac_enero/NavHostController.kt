package dev.fernando.taller_febr_joac_enero

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.fernando.taller_febr_joac_enero.views.UserList
import dev.fernando.taller_febr_joac_enero.views.MenuScreen
import dev.fernando.taller_febr_joac_enero.views.ParameScreen
import dev.fernando.taller_febr_joac_enero.views.ParameScreen2



@Composable
fun NavHostController() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "home") {
        composable(route = "home") { HomePlace(navController) }
        composable(route = "userlist") { UserList(navController) }

        composable(route = "paramescreen/{name}") { backStackEntry ->
            val name = backStackEntry.arguments?.getString("name")
            ParameScreen(name = name ?: "Nombre desconocido", navController = navController)
        }

        composable(route = "paramescreen2/{name}") { backStackEntry ->
            val name = backStackEntry.arguments?.getString("name")
            ParameScreen2(name = name ?: "Nombre desconocido", navController = navController)
        }

        composable(route = "menuscreen") { MenuScreen(navController) }
    }
}

