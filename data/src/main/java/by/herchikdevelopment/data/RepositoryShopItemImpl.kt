package by.herchikdevelopment.data

import by.herchikdevelopment.domain.ShopItemListRepository
import by.herchikdevelopment.domain.models.ShopItem
import io.reactivex.rxjava3.core.Single


class RepositoryShopItemImpl : ShopItemListRepository {

    private val shopItemList = mutableListOf<ShopItem>()

    init {
        for (i in 0 until 10) {
            addShopItem(ShopItem(i.toLong(), "Товар номер $i", ""))
        }
    }

    override fun requestShopItem(): Single<ShopItem> {
        TODO("Not yet implemented")
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