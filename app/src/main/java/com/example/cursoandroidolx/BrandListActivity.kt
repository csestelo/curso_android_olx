package com.example.cursoandroidolx

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_brand_list.*

class BrandListActivity : AppCompatActivity() {

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_brand_list)
//        val item = intent.getStringExtra("texto")
//
//        mainTitle.text = item
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_brand_list)
        val brands = listOf("Audi", "Fiat", "BMW")
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, brands)

        list_item.adapter = adapter

        list_item.setOnItemClickListener {
            adapterView, view, i, l ->
            val clickedItem = brands[i]
            Log.i("item clicado", clickedItem)

            // Como usar Toast
            Toast.makeText(this, "LALALALALA", Toast.LENGTH_LONG).show()

        }

    }
}
