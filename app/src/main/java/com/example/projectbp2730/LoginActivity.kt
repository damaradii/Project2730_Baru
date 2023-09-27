package com.example.projectbp2730

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //instance
        val btnlogin:Button = findViewById(R.id.buttonlog)
        val txtUsername: EditText = findViewById(R.id.Username)
        val txtPassword: EditText = findViewById(R.id.pass)
        val logModel = LoginModel()

        //event
        btnlogin.setOnClickListener {

            //input
            logModel.username = txtUsername.text.toString()
            logModel.password = txtPassword.text.toString()
            //validasi
            if(logModel.loginCek() == true){
                val intenhome = Intent (this, HomeActivity::class.java)
                startActivity(intenhome)
            }else {
                Toast.makeText(this, "username atau password salah", Toast.LENGTH_SHORT).show()
            }
            //call home activity

        }
    }
}