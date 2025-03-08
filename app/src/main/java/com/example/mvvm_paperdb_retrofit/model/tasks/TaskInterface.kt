package com.example.mvvm_paperdb_retrofit.model.tasks

import com.example.mvvm_paperdb_retrofit.model.MyCustomCallBack

interface TaskInterface {
    fun getTaskById(id: String, callBack: MyCustomCallBack<TaskModel>)
    fun getTasks(callBack: MyCustomCallBack<TaskModel>)
    fun addTask(task: TaskModel, callBack: MyCustomCallBack<TaskModel>)
    fun updateTask(task: TaskModel, callBack: MyCustomCallBack<TaskModel>)
    fun deleteTask(id: String, callBack: MyCustomCallBack<TaskModel>)
    fun completeTask(id: String, callBack: MyCustomCallBack<TaskModel>)
    fun syncData(listTasks: List<TaskModel>, callBack: MyCustomCallBack<TaskModel>)
}