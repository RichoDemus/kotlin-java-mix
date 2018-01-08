package com.richo.test.kotlin_java_mix.kotlin

import org.junit.Assert.assertEquals
import org.junit.Test

class UserTest {
    @Test
    fun `Kotlin tests can have spaces in their name`() {
        assertEquals("username", User("username").username)
    }
}
