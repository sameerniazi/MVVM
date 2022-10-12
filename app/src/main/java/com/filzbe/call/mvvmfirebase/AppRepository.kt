package com.filzbe.call.mvvmfirebase

import android.content.Context


public class AppRepository {

    private var instance: AppRepository? = null
    var mNotesList: List<String>? = null
    private fun AppRepository(): AppRepository? {
        return com.filzbe.call.mvvmfirebase.AppRepository()
    }

    fun getInstance(applicationContext: Context): AppRepository? {
        if (instance == null) {
            synchronized(AppRepository::class.java) {
                if (instance == null) {
                    instance = AppRepository()
                }
            }
        }
        return instance
    }


    public fun getdata(): List<String>? {
        mNotesList = listOf(SampleDataProvider.getSampleData())
        return mNotesList
    }




}