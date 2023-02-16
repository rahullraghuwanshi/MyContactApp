package com.rahulraghuwanshi.mycontactapp.presentation.contacts

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.rahulraghuwanshi.mycontactapp.R
import com.rahulraghuwanshi.mycontactapp.data.contact.Contact
import com.rahulraghuwanshi.mycontactapp.databinding.FragmentContactBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ContactFragment : Fragment() {

    private val viewModel by viewModels<ContactViewModel>()

    private var _binding: FragmentContactBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentContactBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initView()
    }

    private fun initView() {
        binding.apply {
            rvContact.layoutManager = LinearLayoutManager(requireContext())
            rvContact.adapter = ContactAdapter(object : ItemClickListener {
                override fun onItemClick(contact: Contact) {
                    navigateToContactInfo(contact)
                }
            }, viewModel.getContactList(requireContext()))
        }
    }

    private fun navigateToContactInfo(contact: Contact) {
        val action = ContactFragmentDirections.actionContactFragmentToContactInfoFragment(contact)
        findNavController().navigate(action)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}