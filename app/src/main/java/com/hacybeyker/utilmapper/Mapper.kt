package com.hacybeyker.utilmapper

/**
 * Generate by Carlos Osorio
 */
import com.google.gson.Gson
import com.google.gson.JsonParser

class Mapper<T1, T2> {

    fun map(`object`: T1, classE: Class<T2>): T2 {
        val gson = Gson()
        val waitForConvert = gson.toJson(`object`)
        return gson.fromJson(waitForConvert, classE)
    }

    fun mapList(`object`: List<T1>, classE: Class<T2>): List<T2> {
        val returnNewList = ArrayList<T2>(`object`.size)
        val gson = Gson()
        val jsonElements = JsonParser().parse(gson.toJson(`object`)).asJsonArray
        for (jsonElement in jsonElements) {
            returnNewList.add(gson.fromJson(jsonElement, classE))
        }
        return returnNewList
    }

    fun mapList(`object`: T1, classE: Class<T2>): List<T2> {
        val returnNewList = ArrayList<T2>()
        val gson = Gson()
        val jsonElements = JsonParser().parse(`object` as String).asJsonArray
        for (jsonElement in jsonElements) {
            returnNewList.add(gson.fromJson(jsonElement, classE))
        }
        return returnNewList
    }
}
