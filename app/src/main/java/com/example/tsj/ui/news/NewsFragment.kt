package com.example.tsj.ui.news

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.RecyclerView
import com.example.tsj.R
import com.example.tsj.adapters.FileAdapter
import com.example.tsj.adapters.FileSource

class NewsFragment : Fragment() {

    private lateinit var newsViewModel: NewsViewModel
    private lateinit var newsAdapter: FileAdapter
    private lateinit var newsrecyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        newsViewModel = ViewModelProviders.of(this).get(NewsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)

        newsrecyclerView = root.findViewById(R.id.recyclerViewFile)
        getRecyclerView()
        getDataSource()

        val textView: TextView = root.findViewById(R.id.text_home)
        newsViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }

    private fun getDataSource() {
        val data = FileSource.crateDtaSet()
        newsAdapter.submitList(data)
    }

    private fun getRecyclerView() {
        newsrecyclerView.apply {
            newsAdapter = FileAdapter()
            adapter = newsAdapter
        }
    }
}