package com.example.tsj.adapters.pager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.tsj.ui.Fragments.ConservedFragment
import com.example.tsj.ui.Fragments.NewHPFragment
import com.example.tsj.ui.history.HistoryFragment

class ViewPagerAdapter(private val myContext: HistoryFragment, fm: FragmentManager, internal var totalTabs: Int) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> {
                return NewHPFragment()
            }
            1 -> {
                return ConservedFragment()
            }
            else -> return NewHPFragment()
        }
    }

    override fun getCount(): Int {
        return totalTabs
    }
}