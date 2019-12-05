package com.example.likedislike
import android.util.Log
import androidx.lifecycle.ViewModel

class CounterViewModel:ViewModel() {

    var likeCount: Int=0

    init{
        Log.d("ViewModel","created")

    }

    fun incrementLike(){
        likeCount++
    }

    override fun onCleared() {
        Log.d("ViewModel","onCleared")
        super.onCleared()
    }
}