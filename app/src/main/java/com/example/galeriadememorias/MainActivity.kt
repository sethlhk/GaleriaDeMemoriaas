

package com.example.galeriadememorias


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Card
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.galeriadememorias.ui.theme.GaleriaDeMemoriasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GaleriaDeMemoriasTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}


@Composable
fun GaleriaDeMemorias(
    idImage: Int,
    idTexto: Int
){
 Card() {

     Column() {

      Image(painter = painterResource(id = idImage)
          , contentDescription = null
      )

         Text(text = stringResource(id = idTexto))
        }
    }
 }
@Preview
@Composable
fun PreviewMoldura(){
    GaleriaDeMemoriasTheme{
        Column() {
            GaleriaDeMemorias(idImage = R.drawable.bielzin
                , idTexto =R.string.bielzin
            )
        }
    }
}

