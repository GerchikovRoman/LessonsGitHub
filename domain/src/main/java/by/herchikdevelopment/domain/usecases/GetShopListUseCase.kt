package by.herchikdevelopment.domain.usecases

import by.herchikdevelopment.domain.ShopItemListRepository
import by.herchikdevelopment.domain.models.ShopItem

class GetShopListUseCase(private val shopListRepository: ShopItemListRepository) {

    fun getShopItemList(): List<ShopItem> = shopListRepository.getShopItemList()
}