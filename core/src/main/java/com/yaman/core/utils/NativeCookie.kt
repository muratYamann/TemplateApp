package com.yaman.core.utils

import android.content.SharedPreferences
import android.preference.PreferenceManager
import com.yaman.core.application.CoreApp

object NativeCookie {

    private val preferences: SharedPreferences
    private val editor: SharedPreferences.Editor
    val KEY_DEVICE_ID = "KEY_DEVICE_ID"

    init {
        preferences = PreferenceManager.getDefaultSharedPreferences(CoreApp.coreComponent.context())
        editor = preferences.edit()
    }

    fun putInt(key: String, value: Int) {
        editor.putInt(key, value)
        editor.commit()
    }

    fun putBoolean(key: String, value: Boolean) {
        editor.putBoolean(key, value)
        editor.commit()
    }

    fun putString(key: String, value: String) {
        editor.putString(key, value)
        editor.commit()
    }

    fun putFloat(key: String, value: Float) {
        editor.putFloat(key, value)
        editor.commit()
    }

    fun putLong(key: String, value: Long) {
        editor.putLong(key, value)
        editor.commit()
    }

    fun removeKey(key: String) {
        editor.remove(key)
        editor.commit()
    }

    fun getLong(key: String, defaultVal: Long): Long {
        return preferences.getLong(key, defaultVal)
    }

    fun getFloat(key: String, defaultVal: Float): Float {
        return preferences.getFloat(key, defaultVal)
    }

    fun getString(key: String, defaultVal: String): String? {
        return preferences.getString(key, defaultVal)
    }

    fun getInt(key: String, defaultVal: Int): Int {
        return preferences.getInt(key, defaultVal)
    }

    fun getBoolean(key: String, defaultVal: Boolean): Boolean {
        return preferences.getBoolean(key, defaultVal)
    }
}