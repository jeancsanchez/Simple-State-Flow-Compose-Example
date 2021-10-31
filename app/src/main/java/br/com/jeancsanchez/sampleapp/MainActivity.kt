package br.com.jeancsanchez.sampleapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import br.com.jeancsanchez.sampleapp.ui.theme.SampleAppTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {

    private val viewModel by lazy { MainViewModel() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            SampleAppTheme {
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }

//        initObservers()
    }

    private fun initObservers() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
//                viewModel.uiState.collect { uiState ->
//                    when (uiState) {
//                        is MainUiState.Loading -> {
//
//                        }
//                    }
//                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SampleAppTheme {
        Greeting("Android")
    }
}