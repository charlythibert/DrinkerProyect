package carlosbernal.drinker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import carlosbernal.drinker.core.navigation.NavigationWrapper
import carlosbernal.drinker.ui.theme.DrinkerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DrinkerTheme {
                NavigationWrapper()
            }
        }
    }
}