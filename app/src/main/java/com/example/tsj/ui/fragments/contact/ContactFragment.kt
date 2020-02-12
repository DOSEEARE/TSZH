package com.example.tsj.ui.fragments.contact

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.tsj.R
import com.example.tsj.ui.activity.History
import com.example.tsj.ui.fragments.list.NewListFragment

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
//        val textView: TextView = root.findViewById(R.id.text_notifications)
        contactViewModel.text.observe(this, Observer {
//            textView.text = it
        })

        imageH.setOnClickListener {
           val intent = Intent(context, History::class.java)
            startActivity(intent)
        }
        return root
    }
}