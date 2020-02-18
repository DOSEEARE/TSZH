package com.example.tsj.ui.news

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.tsj.R
import com.example.tsj.adapters.file.NewsAdapter
import com.example.tsj.adapters.file.NewsSource

//    Maksim



class NewsFragment : Fragment() {

    private lateinit var fAdapter: NewsAdapter
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
        val data = NewsSource.crateDtaSet()
        fAdapter.submitList(data)
    }
    private fun getRecyclerView() {
        recyclerViewF.apply {
            fAdapter = NewsAdapter()
            adapter = fAdapter
        }
    }
}