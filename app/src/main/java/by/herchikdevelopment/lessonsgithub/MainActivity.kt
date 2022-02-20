package by.herchikdevelopment.lessonsgithub

import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import by.herchikdevelopment.domain.models.ShopItem
import by.herchikdevelopment.lessonsgithub.viewModels.MainViewModel

class MainActivity : AppCompatActivity(), ShopItemRecyclerViewAdapter.OnClick {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mainViewModel = ViewModelProvider(this)[MainViewModel::class.java]
        mainViewModel.shopItemList.observe(this) {
            initRecycler(it)
        }
        mainViewModel.getShopItemList()
    }

    private fun initRecycler(list: List<ShopItem>) {
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val recyclerViewAdapter = ShopItemRecyclerViewAdapter(list, this)
        recyclerView.adapter = recyclerViewAdapter
    }

    override fun onClick() {

    }

    override fun onLongClick() {

    }
}