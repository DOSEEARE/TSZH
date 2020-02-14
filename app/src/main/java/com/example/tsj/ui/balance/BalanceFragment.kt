package com.example.tsj.ui.balance


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.tsj.R
import kotlinx.android.synthetic.main.fragment_balance.*

class BalanceFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        balance_show_button.setOnClickListener {
//            findNavController().navigate(R.id.navigation_balance_detail)
        }

        return inflater.inflate(R.layout.fragment_balance, container, false)
    }
}
