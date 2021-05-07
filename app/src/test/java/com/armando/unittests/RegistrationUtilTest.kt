package com.armando.unittests

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    //here is where we generate test cases for Registration Util

    @Test
    fun `empty username returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "12345",
            "12345"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password returns true`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Armando",
            "12345",
            "12345"
        )
        assertThat(result).isTrue()
    }


    @Test
    fun `username already exists returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Peter",
            "12345",
            "12345"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password is empty returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Armando",
            "",
            ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password repeated incorrectly returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Armando",
            "12345",
            "12349"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password contains less than 2 digits returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Armando",
            "1",
            "1"
        )
        assertThat(result).isFalse()
    }


}