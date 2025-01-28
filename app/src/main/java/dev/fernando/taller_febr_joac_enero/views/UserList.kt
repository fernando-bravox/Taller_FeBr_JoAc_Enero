package dev.fernando.taller_febr_joac_enero.views

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Bathtub
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import dev.fernando.taller_febr_joac_enero.Reutilizable.ItemUsuario1
import dev.fernando.taller_febr_joac_enero.Reutilizable.ItemUsuario2
import dev.fernando.taller_febr_joac_enero.Reutilizable.ItemUsuario1

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UserList(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Lista Usuarios", color = Color.Black)
                },
                navigationIcon = {
                    IconButton(
                        onClick = { navController.popBackStack() },
                        modifier = Modifier
                            .padding(8.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(30.dp)
                                .background(Color.LightGray)
                                .padding(6.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Default.ArrowBack,
                                contentDescription = "Go to back",
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                    }



                }
            )
        }
    ) { paddingValues ->

        Column(
            modifier = Modifier
                .padding(paddingValues)
                .verticalScroll(rememberScrollState()) // Agregado el scroll
        ) {
            ItemUsuario1("Luis Perez", Icons.Default.Edit, Icons.Default.Call, navController)
            ItemUsuario1("Mario Cajas", Icons.Default.Edit, Icons.Default.Call, navController)
            ItemUsuario1("Fernando Arteaga", Icons.Default.Edit, Icons.Default.Call, navController)
            ItemUsuario2("Ribaldo Natip", Icons.Default.Bathtub, Icons.Default.Call, navController)
            ItemUsuario2("Jostin Torres", Icons.Default.Bathtub, Icons.Default.Call, navController)
            ItemUsuario2("Domenica Torres", Icons.Default.Bathtub, Icons.Default.Call, navController)
        }

        Box(
            modifier = Modifier
                .fillMaxSize(),
            contentAlignment = Alignment.BottomCenter
        ) {
            FloatingActionButton(
                onClick = { navController.popBackStack() },
                containerColor = Color.White, shape = CircleShape,
                modifier = Modifier
                    .padding(bottom = 50.dp)
                    .width(190.dp)
                    .border(4.dp, Color.LightGray, shape = CircleShape)
            ) {
                Text(
                    text = "Regresar",
                    color = Color.Magenta,
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center
                )
            }
        }

    }
}
