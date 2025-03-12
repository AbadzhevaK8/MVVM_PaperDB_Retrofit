package com.example.mvvm_paperdb_retrofit.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvm_paperdb_retrofit.model.MyCustomCallBack
import com.example.mvvm_paperdb_retrofit.model.tasks.TaskLocalApi
import com.example.mvvm_paperdb_retrofit.model.tasks.TaskModel
import com.example.mvvm_paperdb_retrofit.model.tasks.TaskServerApi
import com.example.mvvm_paperdb_retrofit.repository.TaskRepository
import com.example.mvvm_paperdb_retrofit.retrofit.RetrofitService

class TaskViewModel : ViewModel(), MyCustomCallBack<TaskModel> {
    private var serverRepo = TaskRepository(TaskServerApi())
    private var localRepo = TaskRepository(TaskLocalApi())

    private var _tasks = MutableLiveData<List<TaskModel>>()
    val tasks: LiveData<List<TaskModel>> = _tasks

    private var _currentTask = MutableLiveData<TaskModel?>()
    val currentTask:LiveData<TaskModel?> = _currentTask

    private var _notifyMsg = MutableLiveData<String>()
    val notifyMsg:LiveData<String> = _notifyMsg

    private var isConnected:Boolean = false
        get(){
            return RetrofitService.checkInternetConnection()
        }

    var showActive:Boolean = true
        set(value){
            field = value
            _tasks.value = _tasks.value
        }
    init {

    }

    fun completeTask(id:String){


    }
    fun addTask(task: TaskModel) {


    }
    fun setCurrentTask(task: TaskModel?){

    }

    fun updateTask(task: TaskModel) {

    }

    fun deleteTask(id: String) {

    }

    override fun onSuccess(model: TaskModel) {

    }

    override fun onSuccess(listModel: List<TaskModel>) {

    }

    override fun onFailure(exception: String) {

    }

    override fun notify(msg: String) {

    }
}