package com.dar3.songbookbeta.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.dar3.songbookbeta.R

@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()

    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            TextButton(
                onClick = { navController.navigate("lastPlayedSongs") },

                ) {
                Text("Last played songs")
            }
            Image(
                painter = painterResource(id = R.drawable.circle_arrow_icon),
                contentDescription = null,
                modifier = Modifier.size(20.dp)
            )
        }



        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            TextButton(
                onClick = { navController.navigate("favouriteSongs") },

                ) {
                Text("Favourite songs")
            }
            Image(
                painter = painterResource(id = R.drawable.heart_icon),
                contentDescription = null,
                modifier = Modifier.size(25.dp)
            )
        }


        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            TextButton(
                onClick = { navController.navigate("allSongs") },

                ) {
                Text("All songs")
            }
            Image(
                painter = painterResource(id = R.drawable.three_bars_icon),
                contentDescription = null,
                modifier = Modifier.size(25.dp)
            )
        }

        }
    }