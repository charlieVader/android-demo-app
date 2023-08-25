package com.bonzzu.demo.network

import com.bonzzu.demo.model.Pokemon
import retrofit2.Response
import retrofit2.http.GET

public interface ApiInterface {

    @GET("/api/v2/pokemon/ditto")
    suspend fun getFirstPokemon(): Response<Pokemon>
}