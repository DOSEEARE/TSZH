package com.example.tsj.ui.history


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import com.example.tsj.R
import com.google.android.material.tabs.TabLayout
import com.example.tsj.adapters.pager.ViewPagerAdapter


/**
 * A simple [Fragment] subclass.
 */
class HistoryFragment : Fragment() {
    lateinit var vP: ViewPager
    lateinit var tabLayout: TabLayout

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var root = inflater.inflate(R.layout.fragment_history, container, false)

        tabLayout = root.findViewById(R.id.tabLs)
        vP = root.findViewById(R.id.viewPi)

        tabLayout.addTab(tabLayout.newTab().setText("Sport"))
        tabLayout.addTab(tabLayout.newTab().setText("Movie"))
        tabLayout.tabGravity = TabLayout.GRAVITY_FILL
        tabLayout.tabMode  = TabLayout.MODE_FIXED

        val adapter = ViewPagerAdapter(this, childFragmentManager, tabLayout.tabCount)
        vP.adapter = adapter

        vP.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))

        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                vP.currentItem = tab.position
            }
            override fun onTabUnselected(tab: TabLayout.Tab) {

            }
            override fun onTabReselected(tab: TabLayout.Tab) {

            }
        })

        return root

    }
}
