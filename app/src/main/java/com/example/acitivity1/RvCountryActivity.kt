package com.example.acitivity1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RvCountryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rv_country) // Ensure this matches your XML file name

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val items = listOf(
            CountryData("Country 1"),
            CountryData("Country 2"),
            CountryData("Country 3")
        )

        val adapter = CountryAdapter(items)
        recyclerView.adapter = adapter
    }
}
