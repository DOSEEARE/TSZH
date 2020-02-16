package com.example.tsj.adapters.pager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.tsj.ui.Fragments.BlankFragment
import com.example.tsj.ui.history.HistoryFragment

class ViewPagerAdapter(private val myContext: HistoryFragment, fm: FragmentManager, internal var totalTabs: Int) : FragmentPagerAdapter(fm) {

    // this is for fragment tabs
    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> {
                //  val homeFragment: HomeFragment = HomeFragment()
                return BlankFragment()
            }
            1 -> {
                return BlankFragment()
            }
            else -> return BlankFragment()
        }
    }

    // this counts total number of tabs
    override fun getCount(): Int {
        return totalTabs
    }
}