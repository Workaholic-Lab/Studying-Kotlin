package com.workaholiclab.retrofittest

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

/**
 * @Description:
 * @author: Gary
 * @date: Created on 2021/03/03 9:55
 * @since: Kotlin 1.4
 * @modified by:
 */
object ServiceCreator {
    private const val BASE_URL="http://10.0.2.2/"

    private val retrofit = Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build()

    fun <T> create(serviceClass:Class<T>):T = retrofit.create(serviceClass)

    inline fun <reified T>create():T= create(T::class.java)
}