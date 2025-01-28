package dev.fernando.taller_febr_joac_enero.views


import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuScreen(navController: NavController) {
    var checkedValue by remember { mutableStateOf(false) }
    var checkedValue2 by remember { mutableStateOf(false) }
    var checkedValue3 by remember { mutableStateOf(false) }
    var checkedValue4 by remember { mutableStateOf(false) }
    var checkedValue5 by remember { mutableStateOf(false) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Lista de platos") },
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
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .verticalScroll(rememberScrollState())
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(10.dp)
                        .clickable {
                            checkedValue = !checkedValue
                        }
                ) {
                    Checkbox(
                        checked = checkedValue,
                        onCheckedChange = { checkedValue = it }
                    )
                    Text(text = "Seco de Pollo", fontSize = 20.sp)
                }

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(10.dp)
                        .clickable {
                            checkedValue2 = !checkedValue2
                        }
                ) {
                    Checkbox(
                        checked = checkedValue2,
                        onCheckedChange = { checkedValue2 = it }
                    )
                    Text(text = "Seco de Carne", fontSize = 20.sp)
                }

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(10.dp)
                        .clickable {
                            checkedValue3 = !checkedValue3
                        }
                ) {
                    Checkbox(
                        checked = checkedValue3,
                        onCheckedChange = { checkedValue3 = it }
                    )
                    Text(text = "Tilapia Asada", fontSize = 20.sp)
                }

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(10.dp)
                        .clickable {
                            checkedValue4 = !checkedValue4
                        }
                ) {
                    Checkbox(
                        checked = checkedValue4,
                        onCheckedChange = { checkedValue4 = it }
                    )
                    Text(text = "Maito de Pescado", fontSize = 20.sp)
                }

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(10.dp)
                        .clickable {
                            checkedValue5 = !checkedValue5
                        }
                ) {
                    Checkbox(
                        checked = checkedValue5,
                        onCheckedChange = { checkedValue5 = it }
                    )
                    Text(text = "Guanta al Horno", fontSize = 20.sp)
                }

                Spacer(modifier = Modifier.weight(1f))
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
                        .padding(bottom = 48.dp)  // Ajustando el valor de padding para mover el botón más arriba
                        .padding(start = 16.dp, end = 16.dp) // Ajustando padding horizontal
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
}
