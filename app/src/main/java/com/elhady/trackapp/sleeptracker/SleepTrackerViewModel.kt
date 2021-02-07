package com.elhady.trackapp.sleeptracker

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.elhady.trackapp.database.SleepDatabaseDao

/**
 * Created by islam elhady on 07-Feb-21.
 */
class SleepTrackerViewModel(
    val database: SleepDatabaseDao,
    application: Application
) : AndroidViewModel(application) {
}