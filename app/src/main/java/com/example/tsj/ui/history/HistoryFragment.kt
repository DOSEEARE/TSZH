package com.example.tsj.ui.history


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import com.example.tsj.R
import com.google.android.material.tabs.TabLayout
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_history.view.*
import kotlinx.android.synthetic.main.fragment_history.*
import kotlinx.android.synthetic.main.fragment_history.view.*


/**
 * A simple [Fragment] subclass.
 */
class HistoryFragment : Fragment() {
    lateinit var vP: ViewPager2
    lateinit var tabLayout: TabLayout

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var root = inflater.inflate(R.layout.fragment_history, container, false)

        tabLayout = root.findViewById(R.id.tabLs)
        vP = root.findViewById(R.id.viewPi)

        //https://androidwave.com/viewpager2-with-tablayout-android-example/


        return root

    }
}
