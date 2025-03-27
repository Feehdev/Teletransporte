package com.lilstiffy.teletransporte

import android.app.Application
import com.lilstiffy.teletransporte.service.VibratorService
import com.lilstiffy.teletransporte.storage.StorageManager

class MockGpsApp : Application() {
    companion object {
        lateinit var shared: MockGpsApp
            private set
    }

    override fun onCreate() {
        super.onCreate()
        shared = this
        StorageManager.initialise(this)
        VibratorService.initialise(this)
    }

}