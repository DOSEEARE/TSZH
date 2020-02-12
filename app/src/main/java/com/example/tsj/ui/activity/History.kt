package com.example.tsj.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tsj.R
import com.example.tsj.adapters.pager.HistoryViewPager
import com.example.tsj.ui.fragments.list.NewListFragment
import com.example.tsj.ui.fragments.preservation.PreservationFragment
import kotlinx.android.synthetic.main.activity_history.*

class History : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)

        supportActionBar!!.hide()

        var adapters = HistoryViewPager(supportFragmentManager)
        adapters.addFragment(NewListFragment(),"Новый ЛС")
        adapters.addFragment(PreservationFragment(),"Сохраненные")

        viewP.adapter = adapters
        tabL.setupWithViewPager(viewP)

        beck.setOnClickListener {
            finish()
        }
    }
}