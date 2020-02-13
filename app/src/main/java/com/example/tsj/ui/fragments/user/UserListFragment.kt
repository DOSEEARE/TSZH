package com.example.tsj.ui.fragments.user


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import com.example.tsj.R
import com.example.tsj.model.Company
import com.example.tsj.ui.expandable.ProductAdapter
import mainactivity.musicplayer.example.com.expendelrecyclerview.Product
import java.util.ArrayList

class UserListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_new_list, container, false)
        val recyclerView = root.findViewById<RecyclerView>(R.id.recyclerView)

        val companies = ArrayList<Company>()

        val gogleProduct = ArrayList<Product>()
        gogleProduct.add(Product("7 небо, Токомбаева, д.53/2 кв 11"))

        val gogle = Company("Адрес", gogleProduct)
        companies.add(gogle)

        val microsoftProduct = ArrayList<Product>()
        microsoftProduct.add(Product("Техобслуживание"))

        val microsoft = Company("Услуга", microsoftProduct)
        companies.add(microsoft)

        val microsoftU = ArrayList<Product>()
        microsoftU.add(Product("Техобслуживание"))

        val microsoftOs = Company("Платежи", microsoftProduct)
        companies.add(microsoftOs)

        val microsoftD = ArrayList<Product>()
        microsoftD.add(Product("12/11/2019 - 12/02/2020"))

        val microsoftDs = Company("Даты", microsoftProduct)
        companies.add(microsoftDs)

        val adapter = ProductAdapter(companies)
        recyclerView.adapter = adapter

        return root
    }
}
