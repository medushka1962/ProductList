package com.mydomain.productlist.domain

class GetProductByIdUseCase(private val shopListRepository: ShopListRepository) {
    fun getProductById(productId: Int): Product {
        return shopListRepository.getProductById(productId)
    }
}