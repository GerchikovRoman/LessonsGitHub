package by.herchikdevelopment.lessonsgithub.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import by.herchikdevelopment.data.RepositoryShopItemImpl
import by.herchikdevelopment.domain.ShopItemListRepository
import by.herchikdevelopment.domain.models.ShopItem
import by.herchikdevelopment.domain.usecases.GetShopItemById
import by.herchikdevelopment.domain.usecases.GetShopItemUseCase
import by.herchikdevelopment.domain.usecases.GetShopListUseCase

class MainViewModel : ViewModel() {

    private val repository: ShopItemListRepository = RepositoryShopItemImpl()
    private val getShopItemListUseCase = GetShopListUseCase(repository)
    private val getShopItemUseCase = GetShopItemUseCase(repository)
    private val getShopItemById = GetShopItemById(repository)

    val shopItemList = MutableLiveData<List<ShopItem>>()

    fun getShopItemList() {
        val list = getShopItemListUseCase.getShopItemList()
        shopItemList.value = list
    }
}