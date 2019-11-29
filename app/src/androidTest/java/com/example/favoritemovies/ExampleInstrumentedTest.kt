package com.example.favoritemovies

import android.content.Intent
import androidx.test.InstrumentationRegistry
import androidx.test.InstrumentationRegistry.getInstrumentation
import androidx.test.runner.AndroidJUnit4
import androidx.test.uiautomator.By

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import androidx.test.uiautomator.UiDevice
import androidx.test.uiautomator.Until
import org.hamcrest.CoreMatchers.notNullValue
import org.junit.Before


/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getTargetContext()
        assertEquals("com.example.favoritemovies", appContext.packageName)
    }
}