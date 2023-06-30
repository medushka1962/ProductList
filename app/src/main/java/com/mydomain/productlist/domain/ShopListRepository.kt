package com.mydomain.productlist.domain

interface ShopListRepository {
    fun addProduct(product: Product)
    fun deleteProduct(product: Product)
    fun editProduct(product: Product)
    fun getProductById(productId: Int): Product
    fun getShopList(): List<Product>
    }
