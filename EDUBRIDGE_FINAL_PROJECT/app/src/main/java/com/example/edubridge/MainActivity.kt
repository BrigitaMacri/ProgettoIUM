
package com.example.edubridge

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStudente = findViewById<Button>(R.id.btnStudente)
        val btnDocente = findViewById<Button>(R.id.btnDocente)
        val btnGenitore = findViewById<Button>(R.id.btnGenitore)

        btnStudente.setOnClickListener {
            startActivity(Intent(this, StudenteHomeActivity::class.java))
        }

        btnDocente.setOnClickListener {
            startActivity(Intent(this, DocenteHomeActivity::class.java))
        }

        btnGenitore.setOnClickListener {
            startActivity(Intent(this, GenitoreHomeActivity::class.java))
        }
    }
}
