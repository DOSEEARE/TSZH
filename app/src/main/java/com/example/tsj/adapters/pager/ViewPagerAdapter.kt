package com.example.tsj.adapters.pager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.tsj.ui.history.HistoryFragment
import com.example.tsj.ui.history.graments.NewListFragment
import com.example.tsj.ui.history.graments.SeveFragment

class ViewPagerAdapter(private val myContext: HistoryFragment, fm: FragmentManager, internal var totalTabs: Int) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> {
                return NewListFragment()
            }
            1 -> {
                return SeveFragment()
            }
            else -> return NewListFragment()
        }
    }

    override fun getCount(): Int {
        return totalTabs
    }
}