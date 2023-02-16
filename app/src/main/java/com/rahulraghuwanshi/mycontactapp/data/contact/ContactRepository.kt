package com.rahulraghuwanshi.mycontactapp.data.contact

import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.rahulraghuwanshi.mycontactapp.common.extension.loadJSONFromAsset
import com.rahulraghuwanshi.mycontactapp.data.contact.Contact
import javax.inject.Inject

class ContactRepository @Inject constructor(
    private val gson : Gson
) {

    fun getContactList(context: Context): List<Contact> {
        val string = context.loadJSONFromAsset("contact.json")
        val model = object : TypeToken<List<Contact>>() {}.type
        return gson.fromJson(string, model)
    }
}