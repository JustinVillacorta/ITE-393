package com.example.acitivity1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RvCountryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rv_country)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val items = listOf(
            CountryData("Japan"),
            CountryData("Nigeria"),
            CountryData("USA"),
            CountryData("Philipines"),
            CountryData("United Kingdom"),
            CountryData("Denmark"),
            CountryData("France"),
            CountryData("Finland"),
            CountryData("Poland"),
            CountryData("Australia"),
            CountryData("Ireland"),
            CountryData("Russia"),
            CountryData("Ukraine"),
            CountryData("Brazil"),
            CountryData("Canada"),
            CountryData("Singapore"),
            CountryData("China"),
            CountryData("Netherlands"),
            CountryData("Vietnam"),
            CountryData("Germany")
            )

        val adapter = CountryAdapter(items)
        recyclerView.adapter = adapter
    }
}
