package com.example.cadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cadrant.ui.theme.CadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CadrantTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Cadre()
                }
            }
        }
    }
}

@Composable
fun Cadre(){

    Column (

        modifier = Modifier.fillMaxSize(),


    ){

        Row (

            modifier = Modifier.weight(1f)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically

        ){

            Application(
               libel = stringResource(R.string.libel1),
                corps = stringResource(R.string.corps1) ,
                color  = Color(color = 0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            Application(

                libel = stringResource(R.string.libel2),
                corps = stringResource(R.string.corps2),
                color  = Color(color = 0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )

        }

        Row (

            modifier = Modifier.weight(1f)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically

        ){

            Application(

                libel = stringResource(R.string.libel3),
                corps = stringResource(R.string.corps3),
                color  = Color(color = 0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            Application(

                libel = stringResource(R.string.libel4),
                corps = stringResource(R.string.corps4),
                color  = Color(color = 0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )

        }

    }

}

@Composable
fun Application(libel: String, corps: String, color: Color, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = libel,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp),
            textAlign = TextAlign.Center
        )
        Text(
            text = corps,
            textAlign = TextAlign.Justify,
            modifier = Modifier.fillMaxWidth() 
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CadrePreview() {
    CadrantTheme {
        Cadre()
    }
}