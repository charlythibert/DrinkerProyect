package carlosbernal.drinker.utils

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun CustomOutlinedTextField(
    value: String,
    onValueChange: (String) -> Unit,
    label: String,
    placeholder: String,
    leadingIcon: ImageVector,
    trailingIcon: ImageVector,
    colors: TextFieldColors = TextFieldDefaults.colors(
        // Focused
        focusedTextColor = Color.White,                // Color del texto cuando el campo está enfocado
        focusedContainerColor = Color.Black,           // Color de fondo del contenedor cuando el campo está enfocado
        cursorColor = Color.White,                       // Color del cursor (línea de inserción) dentro del campo
        focusedIndicatorColor = Color.White,           // Color del indicador (la línea debajo del campo) cuando está enfocado
        focusedLeadingIconColor = Color.White,         // Color del ícono en el lado izquierdo del campo cuando está enfocado
        focusedTrailingIconColor = Color.White,        // Color del ícono en el lado derecho del campo cuando está enfocado
        focusedLabelColor = Color.White,             // Color de la etiqueta del campo (que aparece arriba) cuando está enfocado
        focusedPlaceholderColor = Color.White,     // Color del texto del placeholder (texto de ejemplo) cuando el campo está enfocado
        focusedSupportingTextColor = Color.White,      // Color del texto de apoyo (como errores) cuando el campo está enfocado
        focusedPrefixColor = Color.White,              // Color del prefijo (si existe) cuando el campo está enfocado
        focusedSuffixColor = Color.White,              // Color del sufijo (si existe) cuando el campo está enfocado

        // Unfocused
        unfocusedTextColor = Color.Gray,                // Color del texto cuando el campo no está enfocado
        unfocusedContainerColor = Color.Black,       // Color de fondo del contenedor cuando el campo no está enfocado
        unfocusedIndicatorColor = Color.Gray,           // Color del indicador (línea debajo del campo) cuando no está enfocado
        unfocusedLeadingIconColor = Color.Gray,         // Color del ícono en el lado izquierdo cuando el campo no está enfocado
        unfocusedTrailingIconColor = Color.Gray,        // Color del ícono en el lado derecho cuando el campo no está enfocado
        unfocusedLabelColor = Color.Gray,               // Color de la etiqueta del campo cuando no está enfocado
        unfocusedPlaceholderColor = Color.DarkGray,     // Color del texto del placeholder cuando el campo no está enfocado
        unfocusedSupportingTextColor = Color.Gray,      // Color del texto de apoyo (como errores) cuando el campo no está enfocado
        unfocusedPrefixColor = Color.Gray,              // Color del prefijo cuando el campo no está enfocado
        unfocusedSuffixColor = Color.Gray,              // Color del sufijo cuando el campo no está enfocado


        // Error
        errorTextColor = Color.Red,                     // Color del texto cuando hay un error en el campo
        errorContainerColor = Color.Red,                // Color de fondo del contenedor cuando hay un error
        errorCursorColor = Color.Red,                   // Color del cursor cuando hay un error
        errorIndicatorColor = Color.Red,                // Color del indicador (línea debajo del campo) cuando hay un error
        errorLeadingIconColor = Color.Red,              // Color del ícono en el lado izquierdo cuando hay un error
        errorTrailingIconColor = Color.Red,             // Color del ícono en el lado derecho cuando hay un error
        errorLabelColor = Color.Red,                    // Color de la etiqueta del campo cuando hay un error
        errorPlaceholderColor = Color.Red,              // Color del texto del placeholder cuando hay un error
        errorSupportingTextColor = Color.Red,           // Color del texto de apoyo cuando hay un error
        errorPrefixColor = Color.Red,                   // Color del prefijo cuando hay un error
        errorSuffixColor = Color.Red                    // Color del sufijo cuando hay un error

    )
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(label) },
        placeholder = { Text(placeholder) },
        shape = RoundedCornerShape(16.dp),
        colors = colors,
        singleLine = true,
        leadingIcon = {
            Icon(
                imageVector = leadingIcon,
                contentDescription = "Leading Icon"
            )
        },
        trailingIcon = {
            Icon(
                imageVector = trailingIcon,
                contentDescription = "Trailing Icon"
            )
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 10.dp, end = 10.dp, top = 15.dp)
    )
}
