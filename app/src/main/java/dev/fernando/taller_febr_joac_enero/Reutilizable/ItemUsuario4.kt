package dev.fernando.taller_febr_joac_enero.Reutilizable


import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun ItemUsuario4(name: String, icon: ImageVector, icon2: ImageVector, navController: NavHostController) {
    Row(
        horizontalArrangement = Arrangement.Center,  // Estilo centrado de ItemUsuario4
        modifier = Modifier
            .fillMaxWidth()
            .padding(24.dp)
    ) {
        Icon(
            imageVector = icon, contentDescription = name,
            tint = Color.Black
        )
        Text(
            text = name,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(start = 12.dp)
                .clickable {
                    // Navegar a ParameScreen2 pasando el nombre como parte de la ruta
                    navController.navigate("paramescreen2/$name")  // Cambio a ParameScreen2
                }
        )
        Icon(
            imageVector = icon2, contentDescription = name,
            tint = Color.Black
        )
    }
}
