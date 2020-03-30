package com.hacybeyker.utilmapper.entities

import com.google.gson.annotations.SerializedName

data class ProductModel(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("price")
    val price: Double)
