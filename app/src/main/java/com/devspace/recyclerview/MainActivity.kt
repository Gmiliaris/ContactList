package com.devspace.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val rvList = findViewById<RecyclerView>(R.id.rv_list)

    }
}

val contacts = listOf(
    Contact(
        name = "Roque",
        phone = "083 3455434",
        icon = R.drawable.sample12
    ),

    Contact(
        name = "Lucas Almeida",
        phone = "083 1234567",
        icon = R.drawable.sample8
    ),

    Contact(
        name = "Mariana Silva ",
        phone = "083 3455434",
        icon = R.drawable.sample2
    ),

    Contact(
        name = "Ana Costa",
        phone = "083 1234567",
        icon = R.drawable.sample3
    ),
    Contact(
        name = "Ricardo Rocha ",
        phone = "083 3455434",
        icon = R.drawable.sample8
    ),

    Contact(
        name = "Fernanda Lopes",
        phone = "083 1254567",
        icon = R.drawable.sample16
    ),
    Contact(
        name = "Bruno Oliveira",
        phone = "083 3455434",
        icon = R.drawable.sample9
    ),

    Contact(
        name = "Carla Fernandes",
        phone = "083 1284567",
        icon = R.drawable.sample5
    ),
    Contact(
        name = "Letícia Andrade",
        phone = "083 3455434",
        icon = R.drawable.sample7
    ),

    Contact(
        name = "Eduarda Freitas",
        phone = "083 123 4567",
        icon = R.drawable.sample6
    ),
    Contact(
        name = "Juliana Barros",
        phone = "083 3455434",
        icon = R.drawable.sample6
    ),

    Contact(
        name = "Vinícius Tavares ",
        phone = "083 1274567",
        icon = R.drawable.sample14
    ),
)