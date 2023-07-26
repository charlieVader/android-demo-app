package com.bonzzu.demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bonzzu.demo.services.PokeServices
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val retrofit = Retrofit.Builder()
            .baseUrl("https://pokeapi.co/api/v2/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val pokeServices = retrofit.create(PokeServices::class.java).getPokemonByName("ditto")

        pokeServices?.enqueue(object : Callback<String> {
            override fun onResponse(call: Call<String>, response: Response<String>) {
                println("Response string is ${response.body()}")
            }

            override fun onFailure(call: Call<String>, t: Throwable) {
                println("Error")
            }

        })
    }
}