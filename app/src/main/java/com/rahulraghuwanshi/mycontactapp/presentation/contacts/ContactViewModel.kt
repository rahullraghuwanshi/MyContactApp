package com.rahulraghuwanshi.mycontactapp.presentation.contacts

import android.content.Context
import androidx.lifecycle.ViewModel
import com.rahulraghuwanshi.mycontactapp.data.contact.Contact
import com.rahulraghuwanshi.mycontactapp.data.contact.ContactRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ContactViewModel @Inject constructor(
    private val contactRepository: ContactRepository
) : ViewModel() {

    fun getContactList(context: Context): List<Contact> = contactRepository.getContactList(context)
}