package com.nextmovie

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
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
import androidx.compose.ui.unit.sp
import com.nextmovie.ui.theme.NextMovieTheme

class Public {


    @Composable
    public fun Welcome(modifier: Modifier = Modifier){
        Column(
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp)
                .background(color = Color(0xFF121212))
        ){
            Text(
                text = stringResource(R.string.n_e_x_t_m_o_v_i_e),
                fontWeight = FontWeight.Bold,
                fontSize = 32.sp,
                textAlign = TextAlign.Center,
                color = Color(0xFFFFFFFF),
                modifier = modifier.fillMaxWidth()
            )
            Text(
                text = stringResource(R.string.welcome_message),
                fontSize = 20.sp,
                textAlign = TextAlign.Center,
                color = Color(0xFFFFFFFF),
                modifier = modifier.fillMaxWidth()
            )
            Button(
                onClick = {},
                colors = ButtonColors(containerColor = Color.White, contentColor = Color.Black, disabledContainerColor = Color.Black, disabledContentColor = Color.White),
                modifier = modifier
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Text(
                    text = stringResource(R.string.get_started),
                    fontSize = 20.sp
                )
            }
        }
    }

    @Composable
    public fun Login(){

    }

    @Composable
    public fun SignUp(){

    }

    @Composable
    public fun ForgotPassword(){

    }

    @Composable
    public fun About(){

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewPage() {
    NextMovieTheme {
        val page = Public()
        page.Welcome()
    }
}