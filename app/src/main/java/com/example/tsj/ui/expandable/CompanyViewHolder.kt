package com.example.tsj.ui.expandable

import android.view.View
import android.view.animation.Animation
import android.view.animation.RotateAnimation
import android.widget.ImageView
import android.widget.TextView
import com.example.tsj.R
import com.example.tsj.model.Company
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder

class CompanyViewHolder(itemView: View) : GroupViewHolder(itemView) {
    var textC: TextView = itemView.findViewById(R.id.tC)

    fun bind(company: Company) {
        textC.setText(company.title)
    }
}