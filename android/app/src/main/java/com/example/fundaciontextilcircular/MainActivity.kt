package com.example.fundaciontextilcircular

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.fundaciontextilcircular.ui.navigation.AppNav
import com.example.fundaciontextilcircular.ui.theme.FundacionTextilCircularTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FundacionTextilCircularTheme {
                AppNav()
            }
        }
    }
}
