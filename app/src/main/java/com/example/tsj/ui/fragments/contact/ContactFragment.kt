package com.example.tsj.ui.fragments.contact

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.example.tsj.R

class ContactFragment : Fragment() {

    private lateinit var contactViewModel: ContactViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        contactViewModel =
            ViewModelProviders.of(this).get(ContactViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_notifications, container, false)
          val imageH:ImageView = root.findViewById(R.id.imageHistory)
          val imageB:ImageView = root.findViewById(R.id.imageBalance)
          val imageA:ImageView = root.findViewById(R.id.imageApplication)

        imageH.setOnClickListener {
            findNavController().navigate(R.id.navigation_history)
        }
        return root
    }
}