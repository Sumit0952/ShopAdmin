package com.example.shoppingadmin.UI.ui_layer.Sheets.ProductModels


data class Products(
    var productDisplayImage: String?=null,
    var productDisplayImages: ArrayList<String>?= arrayListOf<String>(),
    var productName: String?=null,
    var productDes: String?=null,
    var productPrice: Long?=null,
    var productDiscountPercent: Long?=null,
    var productSize: String?=null,
    var productColor: List<ProductColor>?=null
)

data class ProductColor(var colorName: String?=null, var colorCode: Int?=null)