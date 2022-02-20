package by.herchikdevelopment.data

import android.widget.Toast
import by.herchikdevelopment.domain.ShopItemListRepository
import by.herchikdevelopment.domain.models.ShopItem
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Scheduler
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.schedulers.Schedulers


class RepositoryShopItemImpl(private val shopServiceApi: ShopServiceApi) : ShopItemListRepository {

    private val shopItemList = mutableListOf<ShopItem>()


    init {
        shopServiceApi.getTopTenShopItem("app_id=05858b6b","6c41e086c4f2ffb2410d0b197124a28a")
    }

    override fun getShopItemList(): List<ShopItem> {
        return shopItemList.toList()
    }

    override fun getShopItemById(id: Int): ShopItem {
        return shopItemList[id]
    }

    override fun addShopItem(shopItem: ShopItem) {
        shopItemList.add(shopItem)
    }
}