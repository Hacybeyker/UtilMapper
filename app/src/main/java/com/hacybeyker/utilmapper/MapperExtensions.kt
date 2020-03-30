package com.hacybeyker.utilmapper

import com.google.gson.Gson

inline fun <reified T2> Any.map(): T2 {
    return Gson().fromJson(Gson().toJson(this), T2::class.java)
}