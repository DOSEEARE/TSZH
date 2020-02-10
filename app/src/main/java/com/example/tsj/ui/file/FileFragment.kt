package com.example.tsj.ui.file

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

class FileFragment : Fragment() {

    private lateinit var fileViewModel: FileViewModel
    private lateinit var fAdapter: FileAdapter
    private lateinit var recyclerViewF: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fileViewModel = ViewModelProviders.of(this).get(FileViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)

        recyclerViewF = root.findViewById(R.id.recyclerViewFile)
        getRecyclerView()
        getDataSource()

        val textView: TextView = root.findViewById(R.id.text_home)
        fileViewModel.text.observe(this, Observer {
            textView.text = it
        })
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