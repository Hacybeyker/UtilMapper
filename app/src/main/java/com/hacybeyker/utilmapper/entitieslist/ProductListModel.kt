package com.hacybeyker.utilmapper.entitieslist

data class ProductListModel(
    val id: Int,
    val name: String,
    val description: String,
    val price: Double,
    val categoryListModel: List<CategoryListModel>
)