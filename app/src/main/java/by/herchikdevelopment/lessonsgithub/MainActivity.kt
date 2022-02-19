package by.herchikdevelopment.lessonsgithub

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import by.herchikdevelopment.lessonsgithub.viewModels.MainViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mainViewModel = ViewModelProvider(this)[MainViewModel::class.java]
        mainViewModel.shopItemList.observe(this) {
            val list = it
        }
        mainViewModel.getShopItemList()
    }
}