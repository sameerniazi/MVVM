package com.filzbe.call.mvvmfirebase

import android.app.Application
import androidx.lifecycle.AndroidViewModel

class ListActivityViewModel : AndroidViewModel {
       lateinit var containdata :List<String>

    private var mRepository: AppRepository? = null
    constructor(application: Application) : super(application) {
        mRepository=AppRepository().getInstance(application.applicationContext);
    }


    fun addSampleData(): List<String>? {
     return   mRepository!!.getdata()
    }
}