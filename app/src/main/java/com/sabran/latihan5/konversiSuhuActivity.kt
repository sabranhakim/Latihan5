package com.sabran.latihan5

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class konversiSuhuActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konversi_suhu)

        val inputCelsius = findViewById<EditText>(R.id.inputCelsius)
        val btnKonversi = findViewById<Button>(R.id.btnKonversi)
        val outputFahrenheit = findViewById<TextView>(R.id.outputFahrenheit)
        val outputKelvin = findViewById<TextView>(R.id.outputKelvin)
        val outputReamur = findViewById<TextView>(R.id.outputReamur)

        btnKonversi.setOnClickListener {
            val celsiusText = inputCelsius.text.toString()

            if (celsiusText.isNotEmpty()) {
                val celsius = celsiusText.toDouble()

                // Konversi suhu
                val fahrenheit = (9.0 / 5.0) * celsius + 32
                val kelvin = celsius + 273.15
                val reamur = (4.0 / 5.0) * celsius

                // Tampilkan hasil
                outputFahrenheit.text = "Fahrenheit: $fahrenheit °F"
                outputKelvin.text = "Kelvin: $kelvin K"
                outputReamur.text = "Reamur: $reamur °Ré"
            } else {
                Toast.makeText(this, "Masukkan suhu dalam Celsius!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}