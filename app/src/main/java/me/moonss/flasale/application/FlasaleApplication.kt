package me.moonss.flasale.application

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate

class FlasaleApplication : Application() {
    companion object {
        lateinit var instance: FlasaleApplication
            private set
    }

    override fun onCreate() {
        super.onCreate()
        instance = this

        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)
    }

}