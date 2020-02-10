package com.yaman.templatepp.pages.home

import android.app.AlertDialog
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.yaman.core.utils.FragmentUtil
import com.yaman.templatepp.BuildConfig
import com.yaman.templatepp.R
import com.yaman.templatepp.pages.homefragment.HomeFragment


class HomeActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        if (BuildConfig.DEBUG) {
            Log.d("className: ", this.javaClass.simpleName)
        }

        openHomeFragment()
    }

    override fun onBackPressed() {

        if (supportFragmentManager.backStackEntryCount - 1 > 0)
            super.onBackPressed()
        else if (supportFragmentManager != null && supportFragmentManager.getBackStackEntryAt(
                        0) != null && supportFragmentManager.getBackStackEntryAt(
                        0).name != "HomeFragment") {
            FragmentUtil.clearHistoryAndAddFragment(this, R.id.flContent,
                    "HomeFragment", HomeFragment.newInstance())

        } else
            showLogoutDialog(resources.getString(R.string.exitapp))

    }


   private fun showLogoutDialog(message: String ){
        val alertDialogBuilder = AlertDialog.Builder(
                this)
        alertDialogBuilder
                .setMessage(message)
                .setCancelable(false)
                .setPositiveButton(resources.getString(R.string.yes)) { dialog, _ ->
                    finish()
                    dialog.cancel()
                }
                .setNegativeButton(resources.getString(R.string.NoCancel)) { dialog, _ -> dialog.cancel() }

        val alertDialog = alertDialogBuilder.create()
        alertDialog.show()
        alertDialog.getButton(AlertDialog.BUTTON_NEGATIVE)
                .setTextColor(Color.parseColor("#FD450F"))
        alertDialog.getButton(AlertDialog.BUTTON_POSITIVE)
                .setTextColor(Color.parseColor("#262628"))
    }


    private fun openHomeFragment() {
        FragmentUtil.addFragment(this, R.id.flContent, "HomeFragment", HomeFragment.newInstance())
    }


}
