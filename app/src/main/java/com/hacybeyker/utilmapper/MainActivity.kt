package com.hacybeyker.utilmapper

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.hacybeyker.utilmapper.entities.Product
import com.hacybeyker.utilmapper.entities.ProductModel

class MainActivity : AppCompatActivity() {

    private val TAG: String = MainActivity::class.java.name

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TODO - Here is a web service response
        val productModel = ProductModel(1, "iPhone 11", "Pro Max, Space Grace, 265 GB", 1249.00)
        val product = productModel.map<Product>()
        Log.d(TAG, "This is a product entity  of the entities layer ${product.id} ${product.name} ${product.price}")


//        //Object Only
//        val productModel =
//            ProductModel(1, "MacBook Pro", "Laptop", 12000.00)
//        //val product = Mapper<ProductModel, Product>().map(productModel, Product::class.java)
//        val product = productModel.map<Product>()
//        Toast.makeText(
//            this,
//            "This is a product ${product.name} - ${product.price}",
//            Toast.LENGTH_LONG
//        ).show()
//        Log.d(TAG, "Here - ${product.id} ${product.name} ${product.price}")
//
//        //Object List
//        val categoryListModel: List<CategoryListModel> = arrayListOf(
//            CategoryListModel("tecnologia", "description"),
//            CategoryListModel("latop", "description laptop"),
//            CategoryListModel("portatil", "description portatil")
//        )
//
//        val productListModel = ProductListModel(
//            1,
//            "MacBook Pro",
//            "This is a macbook pro 2019 with touch bar",
//            15000.00,
//            categoryListModel
//        )
//
//        val productList =
//            Mapper<ProductListModel, ProductList>().map(
//                productListModel,
//                ProductList::class.java
//            )
//        Toast.makeText(
//            this,
//            "This is a product ${productList.name} - ${product.price}",
//            Toast.LENGTH_LONG
//        ).show()
//        Log.d(
//            TAG,
//            "Here - ${productList.id} ${productList.name} ${productList.price} ${productList.categoryListModel.get(
//                0
//            ).name}"
//        )

    }
}
