package com.example.activity_test

import android.app.Activity

/**
 * @Description:
 * @author: Gary
 * @date: Created on 2020/10/06 22:48
 * @since: Kotlin 1.4
 * @modified by:
 */
object ActivityCollector {
    private val activities=ArrayList<Activity>()

    fun addActivity(activity: Activity){
        activities.add(activity)
    }

    fun removeActivity(activity: Activity){
        activities.remove(activity)
    }

    fun finishAll(){
        for(activity in activities){
            if(!activity.isFinishing){
                activity.finish()
            }
        }
        activities.clear()
    }
}