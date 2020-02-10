package com.yaman.core.utils

import android.app.Activity
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import com.yaman.core.R


object FragmentUtil {

    fun isActivityDown(activity: Activity?): Boolean {
        return activity?.isFinishing ?: true
    }

    private fun isCurrentFragment(
            activity: FragmentActivity?,
            fragmentName: String
    ): Boolean {
        if (activity == null) {
            return false
        }
        if (activity.isFinishing) {
            return false
        }

        val fragmentCount = activity.supportFragmentManager
                .backStackEntryCount
        if (fragmentCount == 0) {
            return false
        }

        val currentBackStack = activity.supportFragmentManager
                .getBackStackEntryAt(fragmentCount - 1)

        return currentBackStack?.name != null && currentBackStack
                .name.equals(fragmentName)
    }

    fun addFragment(
            activity: FragmentActivity?,
            fragmentContainerId: Int,
            fragmentName: String,
            fragment: Fragment,
            hasAnimation: Boolean = false
    ) {

        if (activity == null) {
            return
        }
        if (activity.isFinishing) {
            return
        }

        val transaction = activity.supportFragmentManager
                .beginTransaction()
        if (hasAnimation)
            transaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit)
        transaction.add(fragmentContainerId, fragment)
        transaction.addToBackStack(fragmentName)
        transaction.commitAllowingStateLoss()
    }


    fun refreshFragment(activity: FragmentActivity, fragmentName: Int) {
        val frg: Fragment? = activity.supportFragmentManager.findFragmentById(fragmentName)
        val ft = activity.supportFragmentManager.beginTransaction()
        ft.detach(frg!!)
        ft.attach(frg)
        ft.commit()
    }

    fun changeFragment(
            @Nullable activity: FragmentActivity?,
            fragmentContainerId: Int, fragmentName: String, fragment: Fragment, hasAnimation: Boolean = false
    ) {
        if (activity == null) {
            return
        }
        if (activity.isFinishing) {
            return
        }
        if (isCurrentFragment(activity, fragmentName)) {
            return
        }

        val transaction = activity.supportFragmentManager.beginTransaction()
        if (hasAnimation)
            transaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit)
        transaction.replace(fragmentContainerId, fragment)
        transaction.addToBackStack(fragmentName)
        transaction.commitAllowingStateLoss()
    }

    fun changeFragmentWithAnimation(
            @Nullable activity: FragmentActivity?,
            fragmentContainerId: Int, fragmentName: String, fragment: Fragment
    ) {
        if (activity == null) {
            return
        }
        if (activity.isFinishing) {
            return
        }
        if (isCurrentFragment(activity, fragmentName)) {
            return
        }

        val transaction = activity.supportFragmentManager.beginTransaction()
        transaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit)
        transaction.replace(fragmentContainerId, fragment)
        transaction.addToBackStack(fragmentName)
        transaction.commitAllowingStateLoss()
    }

    fun clearHistoryAndAddFragment(
            activity: FragmentActivity?,
            fragmentContainerId: Int, fragmentName: String, fragment: Fragment
    ) {
        if (activity == null) {
            return
        }
        if (activity.isFinishing) {
            return
        }

        try {
            activity.supportFragmentManager.popBackStack(null,
                    FragmentManager.POP_BACK_STACK_INCLUSIVE)
        } catch (e: Exception) {
            e.printStackTrace()
        }
        addFragment(activity, fragmentContainerId, fragmentName, fragment)
    }
}
