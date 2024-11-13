package com.example.profileapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicializando componentes
        val profileImage = findViewById<ImageView>(R.id.profileImage)
        val nameText = findViewById<TextView>(R.id.nameText)
        val descriptionText = findViewById<TextView>(R.id.descriptionText)
        val currentJobText = findViewById<TextView>(R.id.currentJobText)
        val experienceLayout = findViewById<LinearLayout>(R.id.experienceLayout)

        // Definindo informações de perfil
        nameText.text = "Yuri Alberto"
        descriptionText.text = "Jogador Profissional de Futebol do Corinthians"
        currentJobText.text = "Emprego Atual: Jogador do Sport Club Corinthians Paulista"

        // Lista de experiências
        val experiencias = listOf(
            "Santos - Categoria de Base",
            "Santos - Jogador Profissional",
            "Internacional - Jogador Profissional",
            "Zenit - Jogador Profissional",
            "Corinthians - Jogador Profissional"
        )

        // Adicionando experiências dinamicamente
        for (experiencia in experiencias) {
            val textView = TextView(this)
            textView.text = experiencia
            textView.textSize = 16f
            experienceLayout.addView(textView)
        }
    }
}
