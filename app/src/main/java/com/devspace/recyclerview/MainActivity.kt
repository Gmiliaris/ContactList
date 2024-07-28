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

        val rvlist = findViewById<RecyclerView>(R.id.rv_list)
        val ivList = findViewById<ImageView>(R.id.iv_list)
        val ivGrid = findViewById<ImageView>(R.id.iv_grid)
        val adapter = ContactListAdapter()

        rvlist.adapter = adapter
        rvlist.layoutManager = LinearLayoutManager(this)
        adapter.submitList(contacts)

        ivGrid.setOnClickListener {
            rvlist.layoutManager = GridLayoutManager(this, 2)
        }

        ivList.setOnClickListener {
            rvlist.layoutManager = LinearLayoutManager(this)
        }

        adapter.setOnClickListener { contact ->
            val intent = Intent(this, ContactDetailActivity::class.java)
            intent.putExtra("name", contact.name)
            intent.putExtra("phone", contact.phone)
            intent.putExtra("icon", contact.icon)
            startActivity(intent)

        }
    }
}


private val contacts = listOf(
    Contact(
        name = "Douglas",
        phone = "(55) 11 99889-9779",
        icon = R.drawable.sample2
    ),
    Contact(
        name = "Rafael",
        phone = "(55) 11 99889-9779",
        icon = R.drawable.sample10
    ),
    Contact(
        name = "Roque",
        phone = "(55) 11 99889-9779",
        icon = R.drawable.sample12
    ),
    Contact(
        name = "Camila",
        phone = "(55) 11 99889-9779",
        icon = R.drawable.sample1
    ),
    Contact(
        name = "Raquel",
        phone = "(55) 11 99889-9779",
        icon = R.drawable.sample3
    ),
    Contact(
        name = "Roberta",
        phone = "(55) 11 99889-9779",
        icon = R.drawable.sample7
    ),
    Contact(
        name = "Vanessa",
        phone = "(55) 11 99889-9779",
        icon = R.drawable.sample11
    ),
    Contact(
        name = "Fernanda",
        phone = "(55) 11 99889-9779",
        icon = R.drawable.sample13
    ),
    Contact(
        name = "Tiago",
        phone = "(55) 11 99889-9779",
        icon = R.drawable.sample9
    ),
    Contact(
        name = "Ricardo",
        phone = "(55) 11 99889-9779",
        icon = R.drawable.sample8
    ),
    Contact(
        name = "Juliana",
        phone = "(55) 11 99889-9779",
        icon = R.drawable.sample5
    ),
    Contact(
        name = "Francielle",
        phone = "(55) 11 99889-9779",
        icon = R.drawable.sample6
    ),
    Contact(
        name = "Patricia",
        phone = "(55) 11 99889-9779",
        icon = R.drawable.sample4
    ),
    Contact(
        name = "Jessica",
        phone = "(55) 11 99889-9779",
        icon = R.drawable.sample16
    ),
    Contact(
        name = "Antonella",
        phone = "(55) 11 99889-9779",
        icon = R.drawable.sample15
    ),
    Contact(
        name = "Matheus",
        phone = "(55) 11 99889-9779",
        icon = R.drawable.sample14
    ),
)
