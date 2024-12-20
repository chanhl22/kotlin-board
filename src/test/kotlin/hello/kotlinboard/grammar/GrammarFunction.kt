package hello.kotlinboard.grammar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class GrammarFunction {

    @DisplayName("함수 - add")
    @Test
    fun addFunction() {
        val result = add(1, 2, 3)

        assertThat(result).isEqualTo(6)
    }

    @Suppress("SameParameterValue")
    private fun add(a: Int, b: Int, c: Int): Int {
        return a + b + c
    }

    @DisplayName("함수 - multiply")
    @Test
    fun multiplyFunction() {
        val result = multiply(1, 2, 3)

        assertThat(result).isEqualTo(6)
    }

    @Suppress("SameParameterValue")
    private fun multiply(a: Int, b: Int, c: Int) = a * b * c

}