package com.example.tsj.ui.contact

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.example.tsj.R

class ContactFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_contacts, container, false)

          val imageH:ImageView = root.findViewById(R.id.imageHistory)
          val imageB:ImageView = root.findViewById(R.id.imageBalance)
          val imageA:ImageView = root.findViewById(R.id.imageApplication)

        imageH.setOnClickListener {
            findNavController().navigate(R.id.navigation_history)
        }
        return root
    }
}