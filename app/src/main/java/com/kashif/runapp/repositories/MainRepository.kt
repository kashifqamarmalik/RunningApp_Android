package com.kashif.runapp.repositories

import com.kashif.runapp.database.Run
import com.kashif.runapp.database.DAO
import javax.inject.Inject

class MainRepository @Inject constructor(
    val dao: DAO
) {
    suspend fun insertRun(run: Run) = dao.insertRun(run)

    suspend fun deleteRun(run: Run) = dao.deleteRun(run)

    fun getAllRunsSortedByDate() = dao.getAllRunsSortedByDate()

    fun getAllRunsSortedByDistance() = dao.getAllRunsSortedByDistance()

    fun getAllRunsSortedByTimeInMillis() = dao.getAllRunsSortedByTimeInMillis()

    fun getAllRunsSortedByAvgSpeed() = dao.getAllRunsSortedByAvgSpeed()

    fun getAllRunsSortedByCaloriesBurned() = dao.getAllRunsSortedByCaloriesBurned()

    fun getTotalAvgSpeed() = dao.getTotalAvgSpeed()

    fun getTotalDistance() = dao.getTotalDistance()

    fun getTotalCaloriesBurned() = dao.getTotalCaloriesBurned()

    fun getTotalTimeInMillis() = dao.getTotalTimeInMillis()
}