package com.bonzzu.demo.services

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path


interface PokeServices {
    @GET("pokemon/{name}")
    fun getPokemonByName(@Path("name") name: String): Call<String>?
}