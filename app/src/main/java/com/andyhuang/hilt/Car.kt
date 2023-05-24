package com.andyhuang.hilt

import android.util.Log
import javax.inject.Inject


class Car @Inject constructor(
    @BindElectricEngine
    private val engine: Engine
    ) {
    private val TAG = Car::class.java.simpleName

    fun start() {
        Log.i(TAG, "start")
        engine.start()
    }

}