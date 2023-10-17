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

        //button more
        val btnmr : Button = findViewById(R.id.buttonmenumore)

        btnmr.setOnClickListener {
            val intent = Intent (this,AboutActivity::class.java)
            startActivity(intent)
        }
        //-----------------------------------------------------------------------//

        //button bookkid
        val btnbkid : Button = findViewById(R.id.buttonmenu1)

        btnbkid.setOnClickListener {
            val intent = Intent (this,BookKidActivity::class.java)
            startActivity(intent)
        }
        ///----------------------------------------------------------------//
        //reycle
        val rvBuku:RecyclerView = findViewById(R.id.recyclerViewBuku)
        //set layout
        rvBuku.layoutManager = LinearLayoutManager(this)
        //list data buku
        val data = ArrayList<BukuModel>()
        data.add(BukuModel(R.drawable.book1,"Emi's Beach Adventure", "lorem hoo lorem ipsum lorem ipsum"))
        data.add(BukuModel(R.drawable.book2,"Ade's Adventure", "lorem hoo lorem ipsum lorem ipsum"))
        data.add(BukuModel(R.drawable.book3,"Charlotte's Web", "lorem hoo lorem ipsum lorem ipsum"))
        data.add(BukuModel(R.drawable.book4,"Mermaid To Rescue", "lorem hoo lorem ipsum lorem ipsum"))
        data.add(BukuModel(R.drawable.book5,"To The Sea", "lorem hoo lorem ipsum lorem ipsum"))
        data.add(BukuModel(R.drawable.book6,"The Selfish Giant", "lorem hoo lorem ipsum lorem ipsum"))
        data.add(BukuModel(R.drawable.book7,"Wonder", "lorem hoo lorem ipsum lorem ipsum"))
        //set adpater
        val adapter = AdapterHome(data)
        //set adapter
        rvBuku.adapter = adapter

    }
}