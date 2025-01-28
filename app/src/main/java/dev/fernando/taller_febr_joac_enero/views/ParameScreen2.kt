package dev.fernando.taller_febr_joac_enero.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Bathtub
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import dev.fernando.taller_febr_joac_enero.Reutilizable.ItemUsuario1
import dev.fernando.taller_febr_joac_enero.Reutilizable.ItemUsuario2
import dev.fernando.taller_febr_joac_enero.Reutilizable.ItemUsuario3
import dev.fernando.taller_febr_joac_enero.Reutilizable.ItemUsuario4

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ParameScreen2(name: String, navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Parametros", color = Color.Black) },
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
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ) {
                IconButton(onClick = { navController.popBackStack() }) {
                    Icon(
                        imageVector = Icons.Default.Face,
                        contentDescription = "Go to back",
                        modifier = Modifier.size(100.dp)
                    )
                }
            }



            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                ItemUsuario4(name, Icons.Default.Bathtub, Icons.Default.Call, navController)
            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            contentAlignment = Alignment.BottomCenter
        ) {
            FloatingActionButton(
                onClick = { navController.popBackStack() },
                containerColor = Color.LightGray,
                modifier = Modifier
                    .width(150.dp)
                    .height(90.dp)
                    .padding(bottom = 48.dp)
            ) {
                Text(
                    text = "Regresar",
                    color = Color.Black,
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}


