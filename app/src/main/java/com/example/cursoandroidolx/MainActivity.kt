package com.example.cursoandroidolx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("Ciclo de vida", "onCreate")
        clickButton.setOnClickListener {
            Log.i("Quem sou eu", "Clique do botão.")
            val inputText = field.text.toString()
            label.text = inputText

            Log.i("Quem sou eu", "Start de uma nova tela.")
            val intent = Intent(this@MainActivity, BrandListActivity::class.java)
            intent.putExtra("texto", inputText)
            startActivity(intent)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.activity_main_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.add -> startActivity(Intent(this@MainActivity, CreateItemActivity::class.java))
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onStart() {
        super.onStart()
        Log.i("Ciclo de vida", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Ciclo de vida", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Ciclo de vida", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Ciclo de vida", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Ciclo de vida", "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("Ciclo de vida", "onRestart")
    }
}
