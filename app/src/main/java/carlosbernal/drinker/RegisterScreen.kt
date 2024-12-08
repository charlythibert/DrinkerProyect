package carlosbernal.drinker

import androidx.annotation.Nullable
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.CheckCircle
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
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import carlosbernal.drinker.utils.CustomOutlinedTextField

@Composable
fun RegisterScreen(navigateToLogin: () -> Unit) {
    var user by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var repeatpassword by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
            contentDescription = "Arrow Icon",
            tint = Color.White,
            modifier = Modifier
                .padding(top = 30.dp, bottom = 30.dp)
                .size(30.dp)
                .align(Alignment.Start)
                .clickable { navigateToLogin() }
        )

        Image(
            painter = painterResource(id = R.drawable.bg_drinker_sin_fondo),
            contentDescription = "Drinker Logo",
            modifier = Modifier.size(150.dp, 150.dp)
        )

        Text(
            text = "Create Account",
            color = Color.White,
            style = TextStyle(fontSize = 30.sp),
            modifier = Modifier.padding(20.dp)
        )

        CustomOutlinedTextField(
            value = user,
            onValueChange = { user = it },
            label = "User",
            placeholder = "User",
            leadingIcon = Icons.Default.Person,
            trailingIcon = Icons.Default.CheckCircle
        )

        CustomOutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = "Email",
            placeholder = "Email",
            leadingIcon = Icons.Default.Person,
            trailingIcon = Icons.Default.CheckCircle
        )

        CustomOutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = "Password",
            placeholder = "Password",
            leadingIcon = Icons.Default.Person,
            trailingIcon = Icons.Default.CheckCircle
        )

        CustomOutlinedTextField(
            value = repeatpassword,
            onValueChange = { repeatpassword = it },
            label = "Repeat password",
            placeholder = "Repeat password",
            leadingIcon = Icons.Default.Person,
            trailingIcon = Icons.Default.CheckCircle
        )

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(top = 20.dp)
        ) {
            Text(
                "Login",
                color = colorResource(R.color.white),
                modifier = Modifier.padding(end = 10.dp),
                style = TextStyle(
                    fontSize = 30.sp
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

        Text(
            text = "Or create account using social media",
            color = Color.White,
            modifier = Modifier.padding(top = 20.dp)
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Bottom
        ) {
            Box(modifier = Modifier.padding(start = 10.dp, end = 10.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.facebook),
                    contentDescription = "Facebook",
                    modifier = Modifier.size(35.dp)
                )
            }

            Box(modifier = Modifier.padding(start = 10.dp, end = 10.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.instagram),
                    contentDescription = "Instagram",
                    modifier = Modifier.size(35.dp)
                )
            }

            Box(modifier = Modifier.padding(start = 10.dp, end = 10.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.twitter),
                    contentDescription = "Twitter",
                    modifier = Modifier.size(35.dp)
                )
            }

        }

    }
}
