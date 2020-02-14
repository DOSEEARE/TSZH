package com.example.tsj.common

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView

import java.util.ArrayList

abstract class BaseRecyclerAdapter<V : BaseRecyclerViewHolder<*>, T> : RecyclerView.Adapter<V>() {

    private var list: List<T> = ArrayList()

    @get:LayoutRes
    protected abstract val layout: Int

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): V {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(layout, parent, false)
        return OnCreateViewHolder(view)
    }

    protected abstract fun OnCreateViewHolder(view: View): V

    override fun onBindViewHolder(holder: V, position: Int) {
        if (holder is BaseRecyclerViewHolder<*>) {
            val baseHolder = (holder as? BaseRecyclerViewHolder<T>?)
            baseHolder?.bind(list[position])
        }
    }

    private fun getListPosition(position: Int): T {
        return list[position]
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun update(list: List<T>) {
        this.list = list
        notifyDataSetChanged()
    }
}
