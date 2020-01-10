package com.sanmidev.yetanotherpasswordgenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val passwordManager = PasswordManager()
        btn_generate_password.setOnClickListener {
            txt_generated_password.text = passwordManager.generatePassword(true, true, true, true,17)
        }
    }
}
