package by.herchikdevelopment.lessonsgithub

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import by.herchikdevelopment.domain.models.ShopItem

class ShopItemRecyclerViewAdapter(
    private var listShopItem: List<ShopItem>,
    private val onClick: OnClick
) :
    RecyclerView.Adapter<ShopItemRecyclerViewAdapter.ShopItemViewHolder>() {

    fun setListShopItems(listShopItem: List<ShopItem>) {
        this.listShopItem = listShopItem
    }

    private var position: Int = 1
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShopItemViewHolder {
        Log.i("HOLDER_INFO", "$position")
        position++
        return ShopItemViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.shop_item_recycler_view, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ShopItemViewHolder, position: Int) {
        for (list in listShopItem) {
            holder.shopItemName.text = listShopItem[position].name
            holder.shopItemId.text = listShopItem[position].id.toString()
            holder.shopItemImage.setImageResource(R.drawable.ic_apple_juice_drink_fruit_icon)
//            Picasso.with(holder.itemView.context)
//                .load("dsa")
//                .error(R.drawable.ic_launcher_background)
//                .into(holder.shopItemImage)
        }
        holder.itemView.setOnLongClickListener {
            onClick.onClick()
            true
        }
        holder.itemView.setOnClickListener {
            Toast.makeText(
                holder.itemView.context,
                "Click item $position",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    override fun getItemCount(): Int =
        listShopItem.size

    class ShopItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val shopItemId = view.findViewById<TextView>(R.id.tvId)
        val shopItemName = view.findViewById<TextView>(R.id.tvShopName)
        val shopItemImage = view.findViewById<ImageView>(R.id.imageViewShopItem)
    }

    interface OnClick {
        fun onClick()
        fun onLongClick()
    }
}