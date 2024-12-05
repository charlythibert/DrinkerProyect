package carlosbernal.drinker

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import carlosbernal.drinker.utils.CustomOutlinedTextField

@Composable

fun LoginScreen() {
    var user by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.bg_drinker_sin_fondo),
            contentDescription = "Logo Screen",
            modifier = Modifier.size(150.dp, 150.dp)
        )
        Text(
            text = "Welcome to",
            fontSize = 25.sp,
            color = colorResource(id = R.color.white),
            modifier = Modifier.padding(top = 20.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.letras_drinker_sin_fondo),
            contentDescription = "Drinker text",
            modifier = Modifier.size(150.dp, 50.dp)
        )
        CustomOutlinedTextField(
            value = user,
            onValueChange = { user = it },
            label = "User",
            placeholder = "Write your user...",
            leadingIcon = Icons.Default.Person,
            trailingIcon = Icons.Default.CheckCircle
        )
        CustomOutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = "Password",
            placeholder = "Write your password...",
            leadingIcon = Icons.Default.Lock,
            trailingIcon = Icons.Default.CheckCircle
        )
        Text(
            text = "Forgot your password?",
            color = colorResource(id = R.color.white),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp, top = 10.dp),
            style = TextStyle(textAlign = TextAlign.End)
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(top = 20.dp)
        ) {
            Text(
                "Sign in",
                color = colorResource(R.color.white),
                modifier = Modifier.padding(end = 10.dp),
                style = TextStyle(
                    fontSize = 25.sp
                )
            )
            Button(onClick = {}) {
                Icon(
                    imageVector = Icons.Default.PlayArrow,
                    contentDescription = "Arrow Icon",
                    tint = Color.White
                )
            }
        }
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 40.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(text = "Don´t have an account?", color = colorResource(id = R.color.white))
            Text(
                text = "Create", color = colorResource(id = R.color.white),
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    textDecoration = TextDecoration.Underline
                ),
                modifier = Modifier.padding(start = 10.dp)
            )
        }
    }
}

@Preview
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}
