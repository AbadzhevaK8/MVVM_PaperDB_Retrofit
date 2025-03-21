package com.example.mvvm_paperdb_retrofit.retrofit

import com.example.mvvm_paperdb_retrofit.model.tasks.TaskModel
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.HEAD
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface TaskServerInterface {
    @GET("/Task/{id}")
    fun getTaskById(@Path("id") id: String): Call<TaskModel>

    @GET("/Task")
    fun getTasks():Call<List<TaskModel>>

    @POST("/Task")
    fun addTask(@Body task: TaskModel): Call<TaskModel>

    @PUT("/Task/{id}")
    fun updateTask(@Path("id") id:String, @Body task: TaskModel): Call<TaskModel>

    @DELETE("/Task/{id}")
    fun deleteTask(@Path("id") id: String): Call<TaskModel>

    @FormUrlEncoded
    @PUT("/Task/{id}")
    fun completeTask(@Path("id") id:String, @Field("isCompleted") isCompleted:Boolean) : Call<TaskModel>

    @HEAD("/")
    fun checkInternetConnection() : Call<Void>

}