package kong.droid.chaeking

import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import kong.droid.chaeking.model.MainViewModel

@AndroidEntryPoint
class BaseActivity : AppCompatActivity() {
    private val viewModel : MainViewModel by viewModels()

}