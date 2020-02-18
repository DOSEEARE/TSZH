package com.example.tsj.ui.history.graments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity

import com.example.tsj.R

/**
 * A simple [Fragment] subclass.
 */
class SeveFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var root = inflater.inflate(R.layout.fragment_seve, container, false)

        (activity as AppCompatActivity).supportActionBar?.show()
        return root
    }


}
