package com.example.tsj.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tsj.MainActivity
import com.example.tsj.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        login_skip.setOnClickListener {
            startActivity(
                Intent(this, MainActivity::class.java)
            )
        }
    }
}
