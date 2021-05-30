package com.codinginflow.mvvmtodo.data

import androidx.room.*

@Dao
interface TaskDao {

    @Query("SELECT * FROM task_table")
    fun getTasks(): kotlinx.coroutines.flow.Flow<List<Task>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(task: Task)

    @Update
    suspend fun update(task: Task)

    @Delete
    suspend fun delete(task: Task)
}