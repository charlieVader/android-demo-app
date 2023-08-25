package com.bonzzu.demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bonzzu.demo.model.Pokemon
import com.bonzzu.demo.network.ApiInterface
import com.bonzzu.demo.network.RetrofitClient
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity() {
    var pokemon: Pokemon? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getFirstPokemon()
    }

    fun getFirstPokemon() {
        GlobalScope.launch {
            pokemon = getPokemon()

            pokemon?.let{
                println(it.name)
                println(it.game_indices.first().game_index)
            }
        }


    }

    suspend fun getPokemon() : Pokemon? {
        var retrofit = RetrofitClient.getInstance()
        var apiInterface = retrofit.create(ApiInterface::class.java)
        var response = apiInterface.getFirstPokemon()
        if (response.isSuccessful) {
            println("Successfull --------------------")
            return response.body()
        } else {
            println("Error --------------------------------")
            return null
        }
    }
}