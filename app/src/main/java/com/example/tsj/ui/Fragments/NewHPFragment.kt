package com.example.tsj.ui.Fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast

import com.example.tsj.R
import kotlinx.android.synthetic.main.fragment_new_h.*
import kotlinx.android.synthetic.main.fragment_new_list.*
import kotlinx.android.synthetic.main.fragment_new_list.view.*

class NewHPFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var  root = inflater.inflate(R.layout.fragment_new_h, container, false)

        return root
    }
    override fun onStart() {
        super.onStart()

        val address = arrayOf("7 небо, Токомбаева, д.53/2 кв 11")
        val service = arrayOf("Техобслуживание")
        val operation = arrayOf("Платежи")
        val dates = arrayOf("12/11/2019 - 12/02/2020")

        val adapterA = ArrayAdapter<String>(context!!, android.R.layout.simple_dropdown_item_1line, address)
        autoAddress.setAdapter(adapterA)

        autoAddress.onItemClickListener =
            AdapterView.OnItemClickListener { parent, view, position, id ->
                autoAddress.showDropDown()
                val selectedItem = parent.getItemAtPosition(position).toString()
            }
        autoAddress.setOnClickListener {
            autoAddress.showDropDown()
        }
        autoAddress.onFocusChangeListener = View.OnFocusChangeListener { view, b ->
            try {
                autoAddress.showDropDown()
            }catch (e: Exception){ }
        }


            val adapterS = ArrayAdapter<String>(context!!, android.R.layout.simple_dropdown_item_1line, service)
            autoService.setAdapter(adapterS)

            autoService.onItemClickListener =
                AdapterView.OnItemClickListener { parent, view, position, id ->
                    autoService.showDropDown()
                    val selectedItem = parent.getItemAtPosition(position).toString()
                }
            autoService.setOnClickListener {
                autoService.showDropDown()
            }
            autoService.onFocusChangeListener = View.OnFocusChangeListener { view, b ->
                try {
                    autoService.showDropDown()
                }catch (e: Exception){ }
            }


        val adapterO = ArrayAdapter<String>(context!!, android.R.layout.simple_dropdown_item_1line, operation)
        autoOperation.setAdapter(adapterO)

        autoOperation.onItemClickListener =
            AdapterView.OnItemClickListener { parent, view, position, id ->
                autoOperation.showDropDown()
                val selectedItem = parent.getItemAtPosition(position).toString()
            }
        autoOperation.setOnClickListener {
            autoOperation.showDropDown()
        }
        autoOperation.onFocusChangeListener = View.OnFocusChangeListener { view, b ->
            try {
                autoOperation.showDropDown()
            }catch (e: Exception){ }
        }


            val adapterD = ArrayAdapter<String>(context!!, android.R.layout.simple_dropdown_item_1line, dates)
            autoDates.setAdapter(adapterD)

            autoDates.onItemClickListener =
                AdapterView.OnItemClickListener { parent, view, position, id ->
                    autoDates.showDropDown()
                    val selectedItem = parent.getItemAtPosition(position).toString()
                }
            autoDates.setOnClickListener {
                autoDates.showDropDown()
            }
            autoDates.onFocusChangeListener = View.OnFocusChangeListener { view, b ->
                try {
                    autoDates.showDropDown()
                }catch (e: Exception){ }
            }
        }
    }
