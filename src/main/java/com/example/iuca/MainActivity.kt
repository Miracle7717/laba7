package com.example.iuca

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, 0, systemBars.right, systemBars.bottom)
            insets
        }

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)

        var countryName = ArrayList<String>()
        var countryDetail = ArrayList<String>()
        var countryFlag = ArrayList<Int>()

        countryName.add("Italy")
        countryName.add("Germany")
        countryName.add("Kyrgyzstan")
        countryName.add("France")
        countryName.add("Japan")
        countryName.add("Brazil")
        countryName.add("Canada")
        countryName.add("Italy")
        countryName.add("Germany")
        countryName.add("Kyrgyzstan")
        countryName.add("France")
        countryName.add("Japan")
        countryName.add("Brazil")
        countryName.add("Canada")

        countryDetail.add("Capital: Rome")
        countryDetail.add("Capital: Berlin")
        countryDetail.add("Capital: Bishkek")
        countryDetail.add("Capital: Paris")
        countryDetail.add("Capital: Tokyo")
        countryDetail.add("Capital: Brasília")
        countryDetail.add("Capital: Ottawa")
        countryDetail.add("Capital: Rome")
        countryDetail.add("Capital: Berlin")
        countryDetail.add("Capital: Bishkek")
        countryDetail.add("Capital: Paris")
        countryDetail.add("Capital: Tokyo")
        countryDetail.add("Capital: Brasília")
        countryDetail.add("Capital: Ottawa")

        countryFlag.add(R.drawable.italy_flag)
        countryFlag.add(R.drawable.german_flag)
        countryFlag.add(R.drawable.kyrg_flag)
        countryFlag.add(R.drawable.france_flag)
        countryFlag.add(R.drawable.japan_flag)
        countryFlag.add(R.drawable.brazil_flag)
        countryFlag.add(R.drawable.canada_flag)
        countryFlag.add(R.drawable.italy_flag)
        countryFlag.add(R.drawable.german_flag)
        countryFlag.add(R.drawable.kyrg_flag)
        countryFlag.add(R.drawable.france_flag)
        countryFlag.add(R.drawable.japan_flag)
        countryFlag.add(R.drawable.brazil_flag)
        countryFlag.add(R.drawable.canada_flag)

        recyclerView.adapter = CountryAdapter(
            countryName = countryName,
            countryDetail = countryDetail,
            countryFlag = countryFlag,
            context = this,
        )
        recyclerView.adapter = CountryAdapter(
            countryName = countryName,
            countryDetail = countryDetail,
            context = this,
            countryFlag = countryFlag,
        )

    }
}