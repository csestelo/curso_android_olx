package com.example.cursoandroidolx

import android.os.AsyncTask
import android.util.Log
import com.beust.klaxon.Klaxon
import okhttp3.OkHttpClient
import okhttp3.Request
import java.lang.ref.WeakReference

class BrandTask(private val activity: WeakReference<BrandListActivity>) : AsyncTask<Unit, Unit, List<Brand>>() {
    override fun doInBackground(vararg p0: Unit?): List<Brand> {
        val client = OkHttpClient()

        val request = Request.Builder()
            .url("https://api-fipe.olx.com.br/api/v1/fipe-report/latest/brands")
            .build()

        val response = client.newCall(request).execute()

        val brands: List<Brand>? = Klaxon()
            .parseArray<Brand>(response.body()?.string()!!)

        Log.w("Response", brands.toString())

        return brands!!

    }

    override fun onPostExecute(brands: List<Brand>) {
        activity.get()?.showBrands(brands)
    }
}