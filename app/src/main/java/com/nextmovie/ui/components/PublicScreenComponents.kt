package com.nextmovie.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Modifier
import com.nextmovie.R

class PublicScreenComponents {

    private var modifier = Modifier

    @Composable
    fun MainAppTitle(){
        Text(
            text = stringResource(R.string.n_e_x_t_m_o_v_i_e),
            fontFamily = FontFamily(Font(R.font.courier_prime_bold)),
            fontSize = 32.sp,
            textAlign = TextAlign.Center,
            modifier = modifier.fillMaxWidth()
        )
    }
}