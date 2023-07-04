package com.example.crud

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras

class EditTaskViewModelFactory(private val taskId:Long,
                               private val dao:TaskDao)
    :ViewModelProvider.Factory{
        override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T {
            if(modelClass.isAssignableFrom(EditTaskViewModel::class.java)){
                return EditTaskViewModel(taskId,dao) as T
            }
            throw java.lang.IllegalArgumentException("Unknown ViewModel")
        }
    }