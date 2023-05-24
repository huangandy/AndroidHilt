package com.andyhuang.hilt

import android.util.Log
import javax.inject.Inject

interface Engine {
    fun start()
}

class HybridEngine @Inject constructor() : Engine {
    private val TAG = HybridEngine::class.java.simpleName
    override fun start() {
        Log.i(TAG, "start")
    }
}

class ElectricEngine @Inject constructor() : Engine {
    private val TAG = ElectricEngine::class.java.simpleName
    override fun start() {
        Log.i(TAG, "start")
    }
}