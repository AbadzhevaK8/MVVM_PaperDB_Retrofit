package com.example.mvvm_paperdb_retrofit.model

interface MyCustomCallBack<T> {
    fun onSuccess(model: T) {}
    fun onSuccess(listModel: List<T>) {}
    fun onFailure(exception: String) {}
    fun notify(msg: String) {}
}