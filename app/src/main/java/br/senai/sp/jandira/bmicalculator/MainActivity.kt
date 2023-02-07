package br.senai.sp.jandira.bmicalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.bmicalculator.ui.theme.BMICalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BMICalculatorTheme {
                CalculatorScreen()
            }
        }
    }
}

@Composable
@Preview(showSystemUi = true)
fun CalculatorScreen() {

    Surface(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.fillMaxSize()) {
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.bmi),
                contentDescription = " ",
                modifier = Modifier.size(128.dp)
            )

            Text(
                text = stringResource(id = R.string.title),
                fontSize = 32.sp,
                color = Color.Blue,
                letterSpacing = 4.sp,
                fontWeight = FontWeight.SemiBold
            )
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(39.dp)
            ) {
                Text(
                    text = stringResource(id = R.string.weight_label),
                    fontSize = 24.sp
                )
                OutlinedTextField(
                    value = " ", onValueChange = { },
                    modifier = Modifier.fillMaxWidth()
                        .padding(top = 10.dp),
                    shape = RoundedCornerShape(16.dp)
                )

                Text(
                    text = stringResource(id = R.string.height_label),
                    fontSize = 24.sp
                )
                OutlinedTextField(
                    value = " ", onValueChange = { },
                    modifier = Modifier.fillMaxWidth()
                        .padding(top = 10.dp),
                    shape = RoundedCornerShape(16.dp)
                )
                Spacer(modifier = Modifier.height(30.dp))
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp)


                    ) {
                    Text(
                        text = stringResource(id = R.string.button_calculate),
                        fontSize = 24.sp
                    )

                }


            }

            Column() {

            }

        }

    }


}