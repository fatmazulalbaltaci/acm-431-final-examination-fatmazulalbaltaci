package com.yeditepe.finalexam.viewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.yeditepe.finalexam.model.Task

class TaskViewModel : ViewModel() {

    // TODO 1: Create a mutable state list of Task objects
    // Initially add at least 2 tasks

    private val _tasks = mutableStateListOf(
        Task(1, "Task 1", false),
        Task(2, "Task 2", true)
    )

    val tasks: List<Task> get() = _tasks

    fun toggleTask(taskId: Int) {
        // TODO 2: Update isCompleted for the given task
        val index = _tasks.indexOfFirst { it.id == taskId }
        if (index != -1) {
            val task = _tasks[index]
            _tasks[index] = task.copy(isCompleted = !task.isCompleted)
    }
}
}




