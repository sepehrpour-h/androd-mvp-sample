package ir.sepehrpour.androidmvpsample.view

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ir.sepehrpour.androidmvpsample.presenter.contract.ILogin
import ir.sepehrpour.androidmvpsample.presenter.present.LoginPresenter
import ir.sepehrpour.androidmvpsample.ui.theme.AndroidMvpSampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidMvpSampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")

                    login("userName", "123")
                }
            }
        }
    }
}

fun login(userName: String, password: String) {
    val presenter = LoginPresenter(object : ILogin.View {
        override fun onSuccess(message: String) {
            Log.e("3636", message)
        }

        override fun onFail(message: String) {
            Log.e("3636", message)
        }

    })
    presenter.login(userName, password)
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidMvpSampleTheme {
        Greeting("Android")
    }
}