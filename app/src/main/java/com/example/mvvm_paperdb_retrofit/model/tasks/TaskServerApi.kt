package com.example.mvvm_paperdb_retrofit.model.tasks

import com.example.mvvm_paperdb_retrofit.model.MyCustomCallBack
import com.example.mvvm_paperdb_retrofit.retrofit.RetrofitService
import com.example.mvvm_paperdb_retrofit.retrofit.TaskServerInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class TaskServerApi : TaskInterface {
    private val service = RetrofitService.retrofit.create(TaskServerInterface::class.java)
    override fun getTaskById(id: String, callBack: MyCustomCallBack<TaskModel>) {
        try {
            service.getTaskById(id).enqueue(object : Callback<TaskModel> {
                override fun onResponse(p0: Call<TaskModel>, p1: Response<TaskModel>) {
                    callBack.onSuccess(p1.body() ?: TaskModel())
                }

                override fun onFailure(p0: Call<TaskModel>, p1: Throwable) {
                    callBack.onFailure(p1.toString())
                }
            })
        } catch (ex: Exception) {
            callBack.onFailure(ex.toString())
        }
    }

    override fun getTasks(callBack: MyCustomCallBack<TaskModel>) {
        TODO("Not yet implemented")
    }

    override fun addTask(task: TaskModel, callBack: MyCustomCallBack<TaskModel>) {
        TODO("Not yet implemented")
    }

    override fun updateTask(task: TaskModel, callBack: MyCustomCallBack<TaskModel>) {
        TODO("Not yet implemented")
    }

    override fun deleteTask(id: String, callBack: MyCustomCallBack<TaskModel>) {
        TODO("Not yet implemented")
    }

    override fun completeTask(id: String, callBack: MyCustomCallBack<TaskModel>) {
        TODO("Not yet implemented")
    }

    override fun syncData(listTasks: List<TaskModel>, callBack: MyCustomCallBack<TaskModel>) {
        TODO("Not yet implemented")
    }

}