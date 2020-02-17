package com.example.tsj.ui.history.graments


import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.example.tsj.R
import kotlinx.android.synthetic.main.fragment_new_list2.*


class NewListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_new_list2, container, false)
    }
    override fun onStart() {
        super.onStart()

        val address = arrayOf("7 небо, Токомбаева, д.53/2 кв 11")
        val service = arrayOf("Техобслуживание")
        val operation = arrayOf("Платежи")
        val dates = arrayOf("12/11/2019 - 12/02/2020")

        val adapterA = ArrayAdapter<String>(context!!, android.R.layout.simple_dropdown_item_1line, address)
        autoAddress.setAdapter(adapterA)
        autoAddress.setKeyListener(null);
        autoAddress.onItemClickListener =
            AdapterView.OnItemClickListener { parent, view, position, id ->
                autoAddress.showDropDown()
                val col = ColorStateList.valueOf(getResources().getColor(R.color.colorAccent))
                Address.defaultHintTextColor = col
                val selectedItem = parent.getItemAtPosition(position).toString()
            }
        autoAddress.setOnClickListener {
            autoAddress.showDropDown()
        }
        autoAddress.onFocusChangeListener = View.OnFocusChangeListener { view, b ->
            if (b){
                try {
                    autoAddress.showDropDown()
                }catch (e: Exception){ }
            }
        }


        val adapterS = ArrayAdapter<String>(context!!, android.R.layout.simple_dropdown_item_1line, service)
        autoService.setAdapter(adapterS)
        autoService.setKeyListener(null);

        autoService.onItemClickListener =
            AdapterView.OnItemClickListener { parent, view, position, id ->
                autoService.showDropDown()
                val col = ColorStateList.valueOf(getResources().getColor(R.color.colorAccent))
                Service.defaultHintTextColor = col
                val selectedItem = parent.getItemAtPosition(position).toString()

            }
        autoService.setOnClickListener {
            autoService.showDropDown()
        }
        autoService.onFocusChangeListener = View.OnFocusChangeListener { view, b ->
            if (b){
                try {
                    autoService.showDropDown()
                }catch (e: Exception){
                    println()
                }
            }

        }


        val adapterO = ArrayAdapter<String>(context!!, android.R.layout.simple_dropdown_item_1line, operation)
        autoOperation.setAdapter(adapterO)
        autoOperation.setKeyListener(null);

        autoOperation.onItemClickListener =
            AdapterView.OnItemClickListener { parent, view, position, id ->
                autoOperation.showDropDown()
                val col = ColorStateList.valueOf(getResources().getColor(R.color.colorAccent))
                Operation.defaultHintTextColor = col
                val selectedItem = parent.getItemAtPosition(position).toString()

            }
        autoOperation.setOnClickListener {
            autoOperation.showDropDown()
        }
        autoOperation.onFocusChangeListener = View.OnFocusChangeListener { view, b ->
            if (b){
                try {
                    autoOperation.showDropDown()
                }catch (e: Exception){
                    println()
                }
            }
        }


        val adapterD = ArrayAdapter<String>(context!!, android.R.layout.simple_dropdown_item_1line, dates)
        autoDates.setAdapter(adapterD)
        autoDates.setKeyListener(null);

        autoDates.onItemClickListener =
            AdapterView.OnItemClickListener { parent, view, position, id ->
                autoDates.showDropDown()
                val col = ColorStateList.valueOf(getResources().getColor(R.color.colorAccent))
                Dates.defaultHintTextColor = col
                val selectedItem = parent.getItemAtPosition(position).toString()
            }
        autoDates.setOnClickListener {
            autoDates.showDropDown()
        }
        autoDates.onFocusChangeListener = View.OnFocusChangeListener { view, b ->
            if (b){
                try {
                    autoDates.showDropDown()
                }catch (e: Exception){ }
            }
        }
    }
}
