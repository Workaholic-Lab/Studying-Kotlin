package com.workaholiclab.viewmodeltest

import androidx.room.*

/**
 * @Description:
 * @author: Gary
 * @date: Created on 2021/03/04 20:55
 * @since: Kotlin 1.4
 * @modified by:
 */
@Dao
interface UserDao {
    @Insert
    fun insertUser(user:User):Long

    @Update
    fun updateUser(newUser:User)

    @Query("select * from User")
    fun loadAllUsers():List<User>

    @Query("select * from User where age > :age")
    fun loadUsersOlderThan(age:Int):List<User>

    @Delete
    fun deleteUser(user:User)

    @Query("delete from User where lastName = :lastName")
    fun deleteUserByLastName(lastName:String):Int
}