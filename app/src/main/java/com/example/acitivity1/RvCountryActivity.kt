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
            CountryData("JAPAN"),
            CountryData("NIGERIA"),
            CountryData("USA"),
            CountryData("PHILIPPINES"),
            CountryData("UK"),
            CountryData("DENMARK"),
            CountryData("FRANCE"),
            CountryData("FINLAND"),
            CountryData("POLAND"),
            CountryData("AUSTRALIA"),
            CountryData("IRELAND"),
            CountryData("RUSSIA"),
            CountryData("UKRAINE"),
            CountryData("BRAZIL"),
            CountryData("CANADA"),
            CountryData("SINGAPORE"),
            CountryData("CHINA"),
            CountryData("NETHERLANDS"),
            CountryData("VIETNAM"),
            CountryData("GERMANY")
            )

        val adapter = CountryAdapter(items)
        recyclerView.adapter = adapter
    }
}
