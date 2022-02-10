package by.herchikdevelopment.domain.models.usecases

import by.herchikdevelopment.domain.models.Repository
import by.herchikdevelopment.domain.models.ShopItem
import io.reactivex.rxjava3.core.Single

class GetShopItemUseCase(private val repository: Repository) {

    fun requestShopItem(): Single<ShopItem> = repository.requestShopItem()
}