package by.herchikdevelopment.data

import by.herchikdevelopment.domain.models.ShopItem
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface ShopServiceApi {

    @GET("parser?")
    fun getTopTenShopItem(
        @Query("app_id") id: String,
        @Query("app_key") app_key: String
    )
            : Single<List<ShopItem>>

}