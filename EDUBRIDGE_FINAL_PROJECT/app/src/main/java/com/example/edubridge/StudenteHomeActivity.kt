
package com.example.edubridge

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class StudenteHomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_studente_home)

        val btnVideolezione = findViewById<Button>(R.id.btnVideolezione)
        val btnQuiz = findViewById<Button>(R.id.btnQuiz)

        btnVideolezione.setOnClickListener {
            Toast.makeText(this, "Avvio videolezione...", Toast.LENGTH_SHORT).show()
        }

        btnQuiz.setOnClickListener {
            Toast.makeText(this, "Quiz completato! Risultato salvato!", Toast.LENGTH_SHORT).show()
        }
    }
}
