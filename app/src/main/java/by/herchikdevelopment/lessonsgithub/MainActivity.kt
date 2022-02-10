package by.herchikdevelopment.lessonsgithub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import by.herchikdevelopment.domain.models.ShopItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showList(list: List<ShopItem>) {
      //  val view = LayoutInflater.from(this).inflate(R.layout.shopList,this)
    }
}