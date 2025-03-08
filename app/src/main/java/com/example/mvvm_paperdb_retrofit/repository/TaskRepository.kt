package com.example.mvvm_paperdb_retrofit.repository

import com.example.mvvm_paperdb_retrofit.model.MyCustomCallBack
import com.example.mvvm_paperdb_retrofit.model.tasks.TaskInterface
import com.example.mvvm_paperdb_retrofit.model.tasks.TaskModel

class TaskRepository(private val taskInterface: TaskInterface) {
    fun getTaskById(id: String, callBack: MyCustomCallBack<TaskModel>) {
        taskInterface.getTaskById(id, callBack)
    }

    fun getTasks(callBack: MyCustomCallBack<TaskModel>) {
        taskInterface.getTasks(callBack)
    }

    fun addTask(taskModel: TaskModel, callBack: MyCustomCallBack<TaskModel>) {
        taskInterface.addTask(taskModel, callBack)
    }

    fun updateTask(taskModel: TaskModel, callBack: MyCustomCallBack<TaskModel>) {
        taskInterface.updateTask(taskModel, callBack)
    }

    fun deleteTask(id: String, callBack: MyCustomCallBack<TaskModel>) {
        taskInterface.deleteTask(id, callBack)
    }

    fun completeTask(id: String, callBack: MyCustomCallBack<TaskModel>) {
        taskInterface.completeTask(id, callBack)
    }

    fun syncData(listTask: List<TaskModel>, callBack: MyCustomCallBack<TaskModel>) {
        taskInterface.syncData(listTask, callBack)
    }
}