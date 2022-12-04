package com.vivi.noviewmodelexample

import androidx.lifecycle.ViewModel

class CountViewModel:ViewModel() {
    private var count=0
    fun getUpdatedCount():Int{
        return ++count
    }
    fun getCurrentCount():Int{
        return count
    }
}