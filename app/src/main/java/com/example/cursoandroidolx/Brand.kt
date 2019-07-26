package com.example.cursoandroidolx

import com.beust.klaxon.Json
import java.io.Serializable

data class Brand(val id: Int,
                 @Json(name = "brand")
                 val name:String) : Serializable {

    override fun toString(): String {
        return "$id - $name"
    }
}