
package com.example.edubridge

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class GenitoreHomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_genitore_home)

        val btnNotifiche = findViewById<Button>(R.id.btnNotifiche)

        btnNotifiche.setOnClickListener {
            Toast.makeText(this, "Nuova notifica: Voto Matematica 8 - 'Ben fatto!'", Toast.LENGTH_LONG).show()
        }
    }
}
