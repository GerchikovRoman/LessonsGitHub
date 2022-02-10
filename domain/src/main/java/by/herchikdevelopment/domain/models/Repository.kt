package by.herchikdevelopment.domain.models

import io.reactivex.rxjava3.core.Single

interface Repository {
    fun requestShopItem(): Single<ShopItem>
}