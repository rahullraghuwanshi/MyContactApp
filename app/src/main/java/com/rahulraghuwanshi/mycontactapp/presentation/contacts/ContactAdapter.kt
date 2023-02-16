package com.rahulraghuwanshi.mycontactapp.presentation.contacts

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rahulraghuwanshi.mycontactapp.data.contact.Contact
import com.rahulraghuwanshi.mycontactapp.databinding.ItemLayoutContactBinding

class ContactAdapter(
    private val list: List<Contact>
) : RecyclerView.Adapter<ContactAdapter.ContactViewHolder>() {

    inner class ContactViewHolder(val binding: ItemLayoutContactBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding = ItemLayoutContactBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ContactViewHolder(binding)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val contact = list[position]

        holder.binding.apply {
            txtContactName.text = contact.full_name
            txtContactNumber.text = contact.number

            constraint.setOnClickListener {  }
        }
    }

}