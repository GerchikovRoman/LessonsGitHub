package by.herchikdevelopment.lessonsgithub

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import by.herchikdevelopment.domain.models.ShopItem
import com.squareup.picasso.Picasso

class ShopItemRecyclerViewAdapter(private var listShopItem: List<ShopItem>) :
    RecyclerView.Adapter<ShopItemRecyclerViewAdapter.ShopItemViewHolder>() {
    class ShopItemViewHolder(view: View) : RecyclerView.ViewHolder(view)

    fun setListShopItems(listShopItem: List<ShopItem>) {
        this.listShopItem = listShopItem
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShopItemViewHolder =
        ShopItemViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.shop_item_recycler_view, parent, false)
        )

    override fun onBindViewHolder(holder: ShopItemViewHolder, position: Int) {
        val tvId = holder.itemView.findViewById<TextView>(R.id.tvId)
        val nameShopItem = holder.itemView.findViewById<TextView>(R.id.tvShopName)
        val shopItemImage = holder.itemView.findViewById<ImageView>(R.id.imageViewShopItem)

        for (list in listShopItem) {
            tvId.text = list.id.toString()
            nameShopItem.text = list.name
            Picasso.with(holder.itemView.context)
                .load("")
                .error(R.drawable.ic_launcher_background)
                .into(shopItemImage)
        }
    }

    override fun getItemCount(): Int =
        listShopItem.size

}