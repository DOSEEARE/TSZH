package com.example.tsj.ui.personal


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.tsj.R
import com.example.tsj.adapters.pesonal.PersonalAdapter
import com.example.tsj.adapters.pesonal.PersonalSource

/**
 * A simple [Fragment] subclass.
 */
class PersonalFragment : Fragment() {

    private lateinit var adapters: PersonalAdapter
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root =inflater.inflate(R.layout.fragment_personal, container, false)

        recyclerView = root.findViewById(R.id.recyclerPersonal)
        getRecyclerView()
        getDataSource()

        return root
    }
    private fun getDataSource(){
        val data = PersonalSource.personalDtaSet()
        adapters.submitList(data)
    }
    private fun getRecyclerView() {
        recyclerView.apply {
            adapters = PersonalAdapter()
            adapter = adapters
        }
    }

}
