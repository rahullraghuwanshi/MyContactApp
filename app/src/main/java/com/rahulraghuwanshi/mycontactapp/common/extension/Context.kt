package com.rahulraghuwanshi.mycontactapp.common.extension

import android.content.Context
import java.io.IOException
import java.nio.charset.StandardCharsets

//to load json from asset folder
fun Context.loadJSONFromAsset(fileName: String): String? {
    val jsonString: String = try {
        val inputStream = assets.open(fileName)
        val size = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        String(buffer, StandardCharsets.UTF_8)
    } catch (e: IOException) {
        e.printStackTrace()
        return null
    }
    return jsonString
}