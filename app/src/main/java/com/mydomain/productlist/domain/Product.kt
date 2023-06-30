package com.mydomain.productlist.domain

data class Product(

    val name: String,
    val disc: String,
    val count: Int,
    val enabled: Boolean,
    var id: Int = UNDEFINED_ID,
){
    companion object {
        const val UNDEFINED_ID = -1
    }
}
