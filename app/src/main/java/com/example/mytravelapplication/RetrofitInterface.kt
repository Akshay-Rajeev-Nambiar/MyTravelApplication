package com.example.mytravelapplication

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitInterface{
    @GET("Kannur.json?limit=1&key=t8a3WxowYySTrxdQG8K3NxE4QKUV9QwG")
    fun getPlaceData(
            @Query("query") query: String
    ) : Call<ResponseData>
}