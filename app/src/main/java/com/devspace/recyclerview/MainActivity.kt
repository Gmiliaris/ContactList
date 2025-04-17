package com.devspace.recyclerview

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
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
        val ivList = findViewById<ImageView>(R.id.iv_list)
        val ivGrid = findViewById<ImageView>(R.id.iv_grid)
        val adapter = ContactListAdapter()

        rvList.adapter = adapter
        rvList.layoutManager = LinearLayoutManager(this)
        adapter.submitList(contacts)

        ivGrid.setOnClickListener {
            rvList.layoutManager = GridLayoutManager(this, 2)
        }

        ivList.setOnClickListener {
            rvList.layoutManager = LinearLayoutManager(this)
        }

        adapter.setOnClickListener { contact ->
            val intent = Intent(this, ContactDetailActivity::class.java)
            intent.putExtra("name", contact.name)
            intent.putExtra("phone", contact.phone)
            intent.putExtra("icon", contact.icon)
            startActivity(intent)
        }

    }

    val contacts = listOf(
        Contact(
            name = "John Doe",
            phone = "+353 85 123 4567",
            icon = R.drawable.sample14
        ),

        Contact(
            name = "Vanessa Miller",
            phone = "+353 87 123 4567",
            icon = R.drawable.sample3
        ),

        Contact(
            name = "Camila Mendes",
            phone = "+353 83 126 4567",
            icon = R.drawable.sample15
        ),

        Contact(
            name = "Liam O'Sullivan",
            phone = "+353 86 234 5678",
            icon = R.drawable.sample9
        ),

        Contact(
            name = "Megan Ryan",
            phone = "+353 87 234 5678",
            icon = R.drawable.sample13
        ),

        Contact(
            name = "Emma Gallagher",
            phone = "+353 89 567 8901",
            icon = R.drawable.sample7
        ),

        Contact(
            name = "Juliana Gomes ",
            phone = "+353 85 890 1234",
            icon = R.drawable.sample1
        ),

        Contact(
            name = "Pedro Almeida",
            phone = "+353 89 567 8901",
            icon = R.drawable.sample8
        ),

        Contact(
            name = "Carla Rocha",
            phone = "+353 87 678 9012",
            icon = R.drawable.sample16
        ),

        Contact(
            name = "Vanessa Cardoso",
            phone = "+353 83 253 4567",
            icon = R.drawable.sample6
        ),

        Contact(
            name = "Eduardo Lima",
            phone = "+353 83 143 4567",
            icon = R.drawable.sample10
        ),

        Contact(
            name = "Renata Nunes",
            phone = "+353 83 162 4567",
            icon = R.drawable.sample4
        ),

        Contact(
            name = "Roisin Moore",
            phone = "+353 143 4567",
            icon = R.drawable.sample11
        ),

        Contact(
            name = "Roque Buarque",
            phone = "+353 89 125 4567",
            icon = R.drawable.sample12
        ),

        Contact(
            name = "Bruna Costa",
            phone = "+353 86 126 4567",
            icon = R.drawable.sample5
        ),
    )
}