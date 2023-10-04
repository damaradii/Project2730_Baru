package com.example.projectbp2730

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import androidx.fragment.app.Fragment
import com.example.projectbp2730.databinding.ActivityBookKidBinding

class BookKidActivity : AppCompatActivity() {
    lateinit var binding: ActivityBookKidBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBookKidBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //event saat button fairy di klik
        binding.buttonFairy.setOnClickListener {
            replaceFragment(FairyFragment()) }

        //event saat button fable
        binding.buttonFable.setOnClickListener {
            replaceFragment(FableFragment())
        }

        //event saat button science
        binding.buttonScience.setOnClickListener {
            replaceFragment(ScienceFragment())
        }
    }
    //ganti fragment
    private fun replaceFragment(frg:Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTrx = fragmentManager.beginTransaction()
        fragmentTrx.replace(R.id.fragmentKidBook,frg)
        fragmentTrx.commit()
    }
}