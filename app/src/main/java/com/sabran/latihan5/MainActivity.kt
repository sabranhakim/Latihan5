package com.sabran.latihan5

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var btnkonversiSuhu : Button
    private lateinit var btndiskonBelanja : Button
    private lateinit var btnHitung : Button
    private lateinit var btnGanjilAtauGenap : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnkonversiSuhu = findViewById(R.id.btnkonversiSuhu)
        btndiskonBelanja = findViewById(R.id.btndiskonBelanja)
        btnHitung = findViewById(R.id.btnHitung)
        btnGanjilAtauGenap = findViewById(R.id.btnGanjilAtauGenap)


        // untuk 1 screen terdiri dari 1 main activity dan 1 file xml layout
        // untuk widget yang dipakai, harus dideklarasi dahulu
        // kita deklarasi findviewby id

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnkonversiSuhu.setOnClickListener() {
            val intentMenu2 = Intent(this@MainActivity, konversiSuhuActivity::class.java)
            startActivity(intentMenu2)
        }

        btndiskonBelanja.setOnClickListener() {
            val intentMenu2 = Intent(this@MainActivity, DiskonBelanjaActivity::class.java)
            startActivity(intentMenu2)
        }
        btnHitung.setOnClickListener() {
            val intentMenu2 = Intent(this@MainActivity, HitungActivity::class.java)
            startActivity(intentMenu2)
        }
        btnGanjilAtauGenap.setOnClickListener() {
            val intentMenu2 = Intent(this@MainActivity, GanjilAtauGenapActivity::class.java)
            startActivity(intentMenu2)
        }
    }
}