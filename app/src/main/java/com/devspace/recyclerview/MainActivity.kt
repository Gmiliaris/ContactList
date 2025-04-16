package com.devspace.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
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
        val adapter = ContactListAdapter()
        rvList.adapter = adapter
        rvList.layoutManager = LinearLayoutManager(this)
        adapter.submitList(contacts)
    }

}

val contacts = listOf(
    Contact(
        "John Doe",
        "+353 85 123 4567",
        R.drawable.sample14
    ),

    Contact(
        "Vanessa Miller",
        "+353 87 123 4567",
        R.drawable.sample3
    ),

    Contact(
        "Camila Mendes",
        "+353 83 126 4567",
        R.drawable.sample15
    ),

    Contact(
        "Liam O'Sullivan",
        "+353 86 234 5678",
        R.drawable.sample9
    ),

    Contact(
        "Megan Ryan",
        "+353 87 234 5678",
        R.drawable.sample13
    ),

    Contact(
        "Emma Gallagher",
        "+353 89 567 8901",
        R.drawable.sample7
    ),

    Contact(
        "Juliana Gomes ",
        "+353 85 890 1234",
        R.drawable.sample1
    ),

    Contact(
        "Pedro Almeida",
        "+353 89 567 8901",
        R.drawable.sample8
    ),

    Contact(
        "Carla Rocha",
        "+353 87 678 9012",
        R.drawable.sample16
    ),

    Contact(
        "Vanessa Cardoso",
        "+353 83 253 4567",
        R.drawable.sample6
    ),

    Contact(
        "Eduardo Lima",
        "+353 83 143 4567",
        R.drawable.sample10
    ),

    Contact(
        "Renata Nunes",
        "+353 83 162 4567",
        R.drawable.sample4
    ),

    Contact(
        "Roisin Moore",
        "+353 143 4567",
        R.drawable.sample11
    ),

    Contact(
        "Roque Buarque",
        "+353 89 125 4567",
        R.drawable.sample12
    ),

    Contact(
        "Bruna Costa",
        "+353 86 126 4567",
        R.drawable.sample5
    ),
)