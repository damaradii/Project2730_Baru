package com.example.projectbp2730

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterFable(private val ListBuku:List<BukuModel>):RecyclerView.Adapter<AdapterFable.ViewHolder>(){
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView){
        val image: ImageView = itemView.findViewById(R.id.imageViewbuku1)
        val title: TextView = itemView.findViewById(R.id.textViewTitle)
        val desc: TextView = itemView.findViewById(R.id.textViewdesc)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterFable.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.card_layout_view,parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: AdapterFable.ViewHolder, position: Int) {
        val modelBuku = ListBuku[position]

        holder.image.setImageResource(modelBuku.image)
        holder.title.text = modelBuku.title
        holder.desc.text = modelBuku.desc
    }

    override fun getItemCount(): Int {
        return ListBuku.size
    }
}