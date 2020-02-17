package com.example.tsj.ui.news

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.RecyclerView
import com.example.tsj.R
import com.example.tsj.adapters.FileAdapter
import com.example.tsj.adapters.FileSource

//    Maksim



class NewsFragment : Fragment() {

    private lateinit var fAdapter: FileAdapter
    private lateinit var recyclerViewF: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_news, container, false)

        recyclerViewF = root.findViewById(R.id.recyclerViewFile)
        getRecyclerView()
        getDataSource()

        return root
    }
    private fun getDataSource(){
        val data = FileSource.crateDtaSet()
        fAdapter.submitList(data)
    }
    private fun getRecyclerView() {
        recyclerViewF.apply {
            fAdapter = FileAdapter()
            adapter = fAdapter
        }
    }
}