package com.example.todoapp

sealed class TaskCategory(var isSelected: Boolean = true) {
    object Personal : TaskCategory() //Personal category object (TaskCategory type)
    object Profesional : TaskCategory() //Business category object (TaskCategory type)
    object Otro : TaskCategory()    //Other category object (TaskCategory type)
}