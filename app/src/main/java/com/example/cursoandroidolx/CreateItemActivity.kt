package com.example.cursoandroidolx

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class CreateItemActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("Quem sou eu", "Tela de criação de novo item.")

        }

}