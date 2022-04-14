package com.example.workerscard

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

data class Worker(
    val name: String,
    val post: String,
    val achievements: String,
    val contacts: String,
    val experience: String
)

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val worker = Worker(
            "Антон Павлович Приходько",
            "Старший заведуший в отделе кадров",
            "Работник месяца",
            "+7 953 145 89 14",
            "5 лет"
        )
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.workerFIO).text = worker.name
        findViewById<TextView>(R.id.achievementsList).text = worker.achievements
        findViewById<TextView>(R.id.contactsList).text = worker.contacts
        findViewById<TextView>(R.id.workerPost).text = worker.post
        findViewById<TextView>(R.id.workerExperience).text = "Стаж - ${worker.experience}"
        findViewById<ImageView>(R.id.workerPhoto).setImageResource(R.drawable.worker);
    }
}