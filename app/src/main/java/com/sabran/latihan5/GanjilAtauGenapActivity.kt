package com.sabran.latihan5

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class GanjilAtauGenapActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ganjil_atau_genap)

        // Referensi ke komponen UI
        val inputBilangan = findViewById<EditText>(R.id.inputBilangan)
        val btnCek = findViewById<Button>(R.id.btnCek)
        val outputHasil = findViewById<TextView>(R.id.outputHasil)

        // Tombol cek di-click
        btnCek.setOnClickListener {
            val bilanganText = inputBilangan.text.toString()

            if (bilanganText.isNotEmpty()) {
                val bilangan = bilanganText.toInt()

                // Cek apakah bilangan ganjil atau genap
                val hasil = if (bilangan % 2 == 0) {
                    "$bilangan adalah bilangan genap"
                } else {
                    "$bilangan adalah bilangan ganjil"
                }

                // Tampilkan hasil
                outputHasil.text = "Hasil: $hasil"
            } else {
                Toast.makeText(this, "Masukkan bilangan bulat!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}