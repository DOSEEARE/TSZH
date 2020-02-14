package com.example.tsj.ui.fragments.user


import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tsj.R
import android.widget.ArrayAdapter
import android.widget.Spinner


class UserListFragment : Fragment(){

    var items = arrayOf("One", "Two", "Three")

    @SuppressLint("ResourceType")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_new_list, container, false)

        val spinner = root.findViewById<Spinner>(R.id.material_spinner)

        val adapters = ArrayAdapter<String>(requireActivity(), R.layout.support_simple_spinner_dropdown_item, items.toList())

        spinner.adapter = adapters

        return root
    }
}
