package com.androiddevs.unittesthomework

import com.google.common.truth.Truth
import org.junit.Test


class HomeworkTest {

    @Test
    fun fibTest() {
        val result = Homework.fib(2)
        Truth.assertThat(result).isEqualTo(1)
    }

    @Test
    fun checkBracesFalseTest() {
        val result = Homework.checkBraces("(2*(1+2)")

        Truth.assertThat(result).isFalse()
    }

    @Test
    fun checkBracesTrueTest() {
        val result = Homework.checkBraces("(2*(1+2))+(11)")
        Truth.assertThat(result).isTrue()
    }
}