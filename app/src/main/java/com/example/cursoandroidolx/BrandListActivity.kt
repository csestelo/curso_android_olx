package com.example.cursoandroidolx

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_brand_list.*
import java.lang.ref.WeakReference

class BrandListActivity : AppCompatActivity() {

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_brand_list)
//        val item = intent.getStringExtra("texto")
//
//        mainTitle.text = item
//    }

    private lateinit var task: BrandTask
    private lateinit var adapter: ArrayAdapter<Brand>
    private lateinit var brands: MutableList<Brand>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_brand_list)

        brands = mutableListOf(Brand(1, "Audi"), Brand(2, "BMW"), Brand(3, "GM"))
        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, brands)

        list_brands.adapter = adapter

//        list_item.setOnItemClickListener {
//            adapterView, view, i, l ->
//            val clickedItem = brands[i]
//            Log.i("item clicado", clickedItem)

            // Como usar Toast
            Toast.makeText(this, "LALALALALA", Toast.LENGTH_LONG).show()

        }

//        val blah = BrandTask().execute()

//    }

    override fun onStart() {
        super.onStart()
        task = BrandTask(WeakReference(this))
        task.execute()
    }

    override fun onDestroy() {
        super.onDestroy()
        task.cancel(true)
    }

    fun showBrands(brands: List<Brand>) {
        this.brands.clear()
        this.brands.addAll(brands)
        adapter.notifyDataSetChanged()

    }

//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        menuInflater.inflate(R.menu.activity_main_menu,menu)
//        return super.onCreateOptionsMenu(menu)
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        when(item.itemId){
//            R.id.add -> Log.i("Click", "Add menu")
//        }
//        return super.onOptionsItemSelected(item)
//    }
}
