package com.workaholiclab.databasetest

import android.content.ContentValues

/**
 * @Description:
 * @author: Gary
 * @date: Created on 2021/02/23 21:10
 * @since: Kotlin 1.4
 * @modified by:
 */

fun cvOf(vararg pairs: Pair<String,Any?>)=ContentValues().apply{
    for(pair in pairs){
        val key=pair.first
        val value=pair.second
        when(value){
            is Int->put(key,value)
            is Long->put(key,value)
            is Short->put(key,value)
            is Float->put(key,value)
            is Double->put(key,value)
            is Boolean->put(key,value)
            is String->put(key,value)
            is Byte->put(key,value)
            is ByteArray->put(key,value)
            null->putNull(key)
        }
    }
}