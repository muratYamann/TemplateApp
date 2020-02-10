package com.yaman.templatepp.pages.connectionfailed

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yaman.templatepp.pages.splash.SplashActivity
import kotlinx.android.synthetic.main.connection_failed_fragment.*
import com.yaman.templatepp.R
import org.jetbrains.anko.intentFor


class ConnectionFailedActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.connection_failed_fragment)


        btnTryAgainConnection!!.setOnClickListener {

            startActivity(intentFor<SplashActivity>())
            finish()

        }

    }

}
