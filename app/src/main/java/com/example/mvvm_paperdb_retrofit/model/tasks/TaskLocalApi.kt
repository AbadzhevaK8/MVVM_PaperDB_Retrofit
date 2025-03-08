package com.example.mvvm_paperdb_retrofit.model.tasks

import com.example.mvvm_paperdb_retrofit.model.MyCustomCallBack

class TaskLocalApi:TaskInterface {
    private val TASK_TABLE = "tasks"
    private val TASK_IS_NOT_DEFINE = "TASK IS NOT DEFINE"
    override fun getTaskById(id: String, callback: MyCustomCallBack<TaskModel>) {

    }

    override fun getTasks(callback: MyCustomCallBack<TaskModel>) {

    }

    override fun addTask(task: TaskModel, callback: MyCustomCallBack<TaskModel>) {

    }

    override fun updateTask(task: TaskModel, callback: MyCustomCallBack<TaskModel>) {

    }

    override fun deleteTask(id: String, callback: MyCustomCallBack<TaskModel>) {

    }

    override fun completeTask(id: String, callback: MyCustomCallBack<TaskModel>) {

    }

    override fun syncData(listTasks: List<TaskModel>, callback: MyCustomCallBack<TaskModel>) {

    }
}