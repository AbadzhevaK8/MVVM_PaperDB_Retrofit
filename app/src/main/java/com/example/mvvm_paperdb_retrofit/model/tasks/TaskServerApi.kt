package com.example.mvvm_paperdb_retrofit.model.tasks

import com.example.mvvm_paperdb_retrofit.model.MyCustomCallBack
import com.example.mvvm_paperdb_retrofit.retrofit.RetrofitService
import com.example.mvvm_paperdb_retrofit.retrofit.TaskServerInterface

class TaskServerApi : TaskInterface {
    private val service = RetrofitService.retrofit.create(TaskServerInterface::class.java)
    override fun getTaskById(id: String, callBack: MyCustomCallBack<TaskModel>) {
        TODO("Not yet implemented")
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