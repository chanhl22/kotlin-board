package hello.kotlinboard.grammar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class GrammarToString {

    @DisplayName("형변환")
    @Test
    fun intToString() {
        val a = 123
        val b: String = a.toString()
        print(b)

        assertThat(b).isEqualTo("123")
    }

}