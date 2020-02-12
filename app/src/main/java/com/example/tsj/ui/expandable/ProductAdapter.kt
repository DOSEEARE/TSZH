package com.example.tsj.ui.expandable

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.tsj.R
import com.example.tsj.model.Company

import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup
import mainactivity.musicplayer.example.com.expendelrecyclerview.Product

class ProductAdapter(groups: List<ExpandableGroup<*>>) : ExpandableRecyclerViewAdapter<CompanyViewHolder, ProductViewHolder>(groups) {

    override fun onCreateGroupViewHolder(parent: ViewGroup, viewType: Int): CompanyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.expandable_initi_company, parent, false)
        return CompanyViewHolder(view)
    }

    override fun onCreateChildViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.expandable_initi_product, parent, false)
        return ProductViewHolder(view)
    }

    override fun onBindChildViewHolder(holder: ProductViewHolder, flatPosition: Int, group: ExpandableGroup<*>, childIndex: Int) {
        val product = group.items[childIndex] as Product
        holder.bind(product)
    }

    override fun onBindGroupViewHolder(holder: CompanyViewHolder, flatPosition: Int, group: ExpandableGroup<*>) {
        val company = group as Company
        holder.bind(company)
    }
}
