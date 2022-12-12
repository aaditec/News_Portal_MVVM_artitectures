package com.nitv.newsapp

import android.content.Context
import org.junit.Test

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

class ExampleInstrumentedTest {
   private val context: Context ?= null
    @Test
    fun useAppContext() {
        // Context of the app under test.
        assertEquals("com.nitv.newsapp", context?.packageName)
    }
}