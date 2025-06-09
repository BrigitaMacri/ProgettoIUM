
package com.example.edubridge

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DocenteHomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_docente_home)

        val btnNuovoCompito = findViewById<Button>(R.id.btnNuovoCompito)

        btnNuovoCompito.setOnClickListener {
            Toast.makeText(this, "Compito creato e pubblicato con successo!", Toast.LENGTH_SHORT).show()
        }
    }
}
