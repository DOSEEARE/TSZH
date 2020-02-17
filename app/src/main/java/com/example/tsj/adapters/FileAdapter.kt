package com.example.tsj.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tsj.R
import com.example.tsj.model.FileModel

class FileAdapter() : RecyclerView.Adapter<FileViewHolder>() {

    //    Maksim

    private var model: List<FileModel> = ArrayList()

    fun submitList(list: List<FileModel>) {
        model = list
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FileViewHolder {
        return FileViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_file, parent, false)
        )
    }

    override fun onBindViewHolder(holder: FileViewHolder, position: Int) {
        holder.bind(model.get(position));
    }

    override fun getItemCount(): Int {
        return model.size;
    }


}