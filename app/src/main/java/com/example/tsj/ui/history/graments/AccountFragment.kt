package com.example.tsj.ui.history.graments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.navigation.Navigation
import com.example.tsj.R
import com.example.tsj.ui.personal.PersonalFragment
import com.google.android.material.bottomappbar.BottomAppBar
import kotlinx.android.synthetic.main.fragment_personal.*

class AccountFragment : Fragment() {

    private var idI = 0
    private var title: String? = ""
    private lateinit var textAccounts: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var root= inflater.inflate(R.layout.fragment_account, container, false)

        var bReturn = root.findViewById<Button>(R.id.bottomReturn)

        textAccounts = root.findViewById(R.id.textAccount)
        initArguments()
        textAccounts.setText(title)


        bReturn.setOnClickListener { l->
                Navigation.findNavController(root).navigate(R.id.navigation_Personal)
        }

        return root
    }
    private fun initArguments() {
        assert(arguments != null)
        idI = arguments!!.getInt("id")
        title = arguments!!.getString("title")
    }
}
