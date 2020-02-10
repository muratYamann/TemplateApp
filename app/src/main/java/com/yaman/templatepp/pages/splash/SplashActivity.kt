package com.yaman.templatepp.pages.splash

import android.os.Bundle
import android.os.Handler
import android.util.Log
import com.yaman.core.application.BaseActivity
import com.yaman.core.utils.ConnectionUtil
import com.yaman.templatepp.BuildConfig
import com.yaman.templatepp.R
import com.yaman.templatepp.pages.connectionfailed.ConnectionFailedActivity
import com.yaman.templatepp.pages.home.HomeActivity
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.singleTop


class SplashActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        if (BuildConfig.DEBUG) {
            Log.d("className: ", this.javaClass.simpleName)
        }

        val handler = Handler()
        handler.postDelayed({ jump() }, 2000)

    }

    private fun jump() {

        if (ConnectionUtil.isNetworkAvailable(applicationContext)) {
            startActivity(intentFor<HomeActivity>().singleTop())
            this.finish()
        } else {
            startActivity(intentFor<ConnectionFailedActivity>().singleTop())
            this.finish()
        }
    }


}
