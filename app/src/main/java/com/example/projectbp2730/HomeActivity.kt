 package com.example.projectbp2730

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

 class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnmr : Button = findViewById(R.id.buttonmenumore)

        btnmr.setOnClickListener {
            val inthome = Intent (this, BookKidActivity::class.java)
            startActivity(intent)
        }

    }
}