package com.example.tsj.ui.expandable


import android.view.View
import android.widget.TextView
import com.example.tsj.R
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder
import mainactivity.musicplayer.example.com.expendelrecyclerview.Product

class ProductViewHolder(itemView: View ) : ChildViewHolder(itemView) {
    private var textP:TextView = itemView.findViewById(R.id.tP)

    fun bind(product: Product) {
     textP.setText(product.name)

    }
}