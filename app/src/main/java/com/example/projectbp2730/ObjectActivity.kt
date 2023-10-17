package com.example.projectbp2730

object ListBuku {
    fun getDataBuku(): ArrayList<BukuModel> {
        val listBuku = ArrayList<BukuModel>()

        val buku1 = BukuModel(R.drawable.book1, "Emi's Beach Adventure", "hoo ya ahaha")
        listBuku.add(buku1)

        val buku2 = BukuModel(R.drawable.book2, "Ade's Adventure", "hoo ya ahaha")
        listBuku.add(buku2)

        val buku3 = BukuModel(R.drawable.book3, "Charlotte's Web", "hoo ya ahaha")
        listBuku.add(buku3)

        val buku4 = BukuModel(R.drawable.book4, "Mermaid To Rescue", "hoo ya ahaha")
        listBuku.add(buku4)

        val buku5 = BukuModel(R.drawable.book5, "To The Sea", "hoo ya ahaha")
        listBuku.add(buku5)

        val buku6 = BukuModel(R.drawable.book6, "The Selfish Giant", "hoo ya ahaha")
        listBuku.add(buku6)

        val buku7 = BukuModel(R.drawable.book7, "Wonder", "hoo ya ahaha")
        listBuku.add(buku7)

        return listBuku
    }
}