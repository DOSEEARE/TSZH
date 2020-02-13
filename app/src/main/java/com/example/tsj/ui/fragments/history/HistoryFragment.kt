package com.example.tsj.ui.fragments.history


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.ViewPager
import com.example.tsj.R
import com.example.tsj.adapters.pager.HistoryViewPager
import com.example.tsj.ui.fragments.news.NewsFragment
import com.example.tsj.ui.fragments.user.UserListFragment
import com.example.tsj.ui.fragments.preservation.PreservationFragment
import com.google.android.material.tabs.TabLayout
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController




/**
 * A simple [Fragment] subclass.
 */
class HistoryFragment : Fragment() {
    private lateinit var navController: Navigation

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var root = inflater.inflate(R.layout.fragment_history, container, false)


        var vP = root.findViewById<ViewPager>(R.id.viewPi)
        var taPL = root.findViewById<TabLayout>(R.id.tabLs)

        var adapters = HistoryViewPager(fragmentManager!!)
        adapters.addFragment(UserListFragment(), "Новый ЛС")
        adapters.addFragment(PreservationFragment(), "Сохраненные")

        vP.adapter = adapters
        taPL.setupWithViewPager(vP)

        return root

    }



}
