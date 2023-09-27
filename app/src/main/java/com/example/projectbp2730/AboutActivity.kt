package com.example.projectbp2730

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        //instance
        val imgCall : ImageView = findViewById(R.id.imageViewCall)

        //event
        imgCall.setOnClickListener {
            val callIntent:Intent = Uri.parse("tel:0819293844").let {
                number->
                Intent(Intent.ACTION_DIAL,number)
            }
        }
    }
}