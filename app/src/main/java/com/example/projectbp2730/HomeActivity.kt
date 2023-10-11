 package com.example.projectbp2730

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

 class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnmr : Button = findViewById(R.id.buttonmenumore)

        btnmr.setOnClickListener {
            val inthome = Intent (this, BookKidActivity::class.java)
            startActivity(intent)
        }

        //reycle
        val rvBuku:RecyclerView = findViewById(R.id.recyclerViewBuku)
        //set layout
        rvBuku.layoutManager = LinearLayoutManager(this)
        //list data buku
        val data = ArrayList<BukuModel>()
        data.add(BukuModel(R.drawable.book1,"Emi's Beach Adventure", "lorem hoo siji loro telu papat limaw"))
        data.add(BukuModel(R.drawable.book2,"Emi's Beach Adventure", "lorem hoo siji loro telu papat limaw"))
        data.add(BukuModel(R.drawable.book4,"Emi's Beach Adventure", "lorem hoo siji loro telu papat limaw"))
        data.add(BukuModel(R.drawable.book1,"Emi's Beach Adventure", "lorem hoo siji loro telu papat limaw"))
        data.add(BukuModel(R.drawable.book2,"Emi's Beach Adventure", "lorem hoo siji loro telu papat limaw"))
        data.add(BukuModel(R.drawable.book4,"Emi's Beach Adventure", "lorem hoo siji loro telu papat limaw"))
        //set adpater
        val adapter = AdapterHome(data)
        //set adapter
        rvBuku.adapter = adapter

    }
}