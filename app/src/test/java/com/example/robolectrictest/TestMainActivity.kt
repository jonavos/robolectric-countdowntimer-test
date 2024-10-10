package com.example.robolectrictest

import android.widget.TextView
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.robolectric.Robolectric
import org.robolectric.shadows.ShadowLooper
import java.util.concurrent.TimeUnit

@RunWith(RobolectricTestRunner::class)
class TestMainActivity {
    @Test
    fun `test main activity`() = runTest {
        val controller = Robolectric.buildActivity(MainActivity::class.java).setup()

        ShadowLooper.shadowMainLooper().idleFor(12L, TimeUnit.SECONDS)

        assertEquals("Liftoff!", controller.get().findViewById<TextView>(R.id.textView).text)
    }
}