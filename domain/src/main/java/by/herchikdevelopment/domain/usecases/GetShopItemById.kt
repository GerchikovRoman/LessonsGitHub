package by.herchikdevelopment.domain.usecases

import by.herchikdevelopment.domain.ShopItemListRepository
import by.herchikdevelopment.domain.models.ShopItem

class GetShopItemById(private val shopListRepository: ShopItemListRepository) {

    fun getShopItem(id: Int): ShopItem = shopListRepository.getShopItemById(id)
}