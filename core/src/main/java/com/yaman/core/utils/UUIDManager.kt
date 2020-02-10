package com.yaman.core.utils

import android.content.Context
import android.provider.Settings
import java.util.*

class UUIDManager {

    private var uuid: String? = null

    companion object {
        private var instance: UUIDManager? = null

        @JvmName("getInstance_")
        fun getInstance(): UUIDManager {
            if (instance == null) {
                instance = UUIDManager()
            }
            return instance as UUIDManager
        }
    }

    fun getDeviceSecureId(context: Context): String {
        if (uuid != null)
            return uuid!!
        uuid = generateUUID(context)
        return uuid!!
    }

    private fun generateUUID(context: Context): String {

        try {
            return Settings.Secure.getString(context.contentResolver,
                    Settings.Secure.ANDROID_ID) ?: return createAndSaveUUID()

        } catch (ex: Exception) {
            return createAndSaveUUID()
        }
    }

    private fun createAndSaveUUID(): String {
        uuid = NativeCookie.getString(NativeCookie.KEY_DEVICE_ID, null.toString())
        if (uuid == null) {
            uuid = UUID.randomUUID().toString()
            NativeCookie.putString(NativeCookie.KEY_DEVICE_ID, uuid!!)
        }
        return uuid as String
    }
}