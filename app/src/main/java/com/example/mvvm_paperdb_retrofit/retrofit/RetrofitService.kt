package com.example.mvvm_paperdb_retrofit.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitService {
    private const val URL_MOCKAPI: String = "https://67c9f1e9102d684575c40a36.mockapi.io/"
    var retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(URL_MOCKAPI)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}