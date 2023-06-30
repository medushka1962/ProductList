package com.mydomain.productlist.domain

class AddProductUseCase(private val shopListRepository: ShopListRepository) {
    fun addProduct(product: Product){
        shopListRepository.addProduct(product)
    }
}