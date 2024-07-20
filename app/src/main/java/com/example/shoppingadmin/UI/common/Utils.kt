package com.example.shoppingadmin.UI.common

import android.net.Uri
import android.util.Log
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.ktx.storage
import java.util.UUID

const val PRODUCT_IMAGES_FOLDER_PATH = "Product_images"
const val PRODUCT_DISPLAY_IMAGES_FOLDER_PATH = "Product_Display_images"
const val PRODUCT_PATH = "Product_path"


fun uploadImage(
    path: String,
    uri: Uri,
    function: (isSuccessful: Boolean, fileUrl: String) -> Unit
) {

    Firebase.storage.reference.child("$path/${UUID.randomUUID()}.jpg").putFile(uri)
        .addOnCompleteListener {
            it.result.storage.downloadUrl.addOnSuccessListener {
                function(true, it.toString())
            }

        }
        .addOnProgressListener {
            Log.d("uploadImage", " ${(it.bytesTransferred / it.totalByteCount) * 100} ")
        }
        .addOnFailureListener {

        }


}


