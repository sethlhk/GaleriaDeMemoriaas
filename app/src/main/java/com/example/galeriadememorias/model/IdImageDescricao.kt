package com.example.galeriadememorias.model

import android.media.Image
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class IdImageDescricao(
   @DrawableRes val idImage: Int,
    @StringRes val idTexto: Int
)
