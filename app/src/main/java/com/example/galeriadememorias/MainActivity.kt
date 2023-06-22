

package com.example.galeriadememorias


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Card
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.galeriadememorias.model.IdImageDescricao
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
                    GaleriaMemorias()
            }
        }
    }
}


@Composable
fun GaleriaMemorias(){

    LazyColumn(){
        items(FontDeDdos().CarregaListaDados())
 {     galeriaDeMemorias ->GaleriaDeMemorias(galeriaDeMemorias)
 }
    }

}


@Composable
fun GaleriaDeMemorias(IdImageDescricao:IdImageDescricao){
 Card(
     modifier = Modifier
         .fillMaxWidth()
         .padding(10.dp),
     colors = CardDefaults.cardColors(Color(202, 225, 255)),
     elevation = CardDefaults.cardElevation(5.dp)

 ) {
     Column(
         verticalArrangement = Arrangement.Top,
         horizontalAlignment = Alignment.CenterHorizontally,
         modifier = Modifier.fillMaxWidth()
     ) {

      Image(painter = painterResource(id = IdImageDescricao.idImage)
          , contentDescription = null,
          contentScale =  ContentScale.Companion.Crop,
          modifier = Modifier
              .size(300.dp)
              .padding(10.dp)
      )

              (Text(text = stringResource(id = IdImageDescricao.idTexto),
                  fontSize = 25.sp,
                  modifier = Modifier
                      .padding(3.dp)
              ))

        }
    }
 }
@Preview
@Composable
fun PreviewMoldura() {
    GaleriaDeMemoriasTheme {
        Column() {
            GaleriaDeMemorias(
                IdImageDescricao(R.drawable.bielzin, R.string.bielzin)
            )
        }
    }
}
}

