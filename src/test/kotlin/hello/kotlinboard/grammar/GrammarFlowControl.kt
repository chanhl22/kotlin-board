package hello.kotlinboard.grammar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class GrammarFlowControl {

    @DisplayName("break")
    @Test
    fun testBreak() {
        var result = 0
        for (i in 0..5) {
            if (i == 2) {
                result = 2
                break
            }
        }

        assertThat(result).isEqualTo(2)
    }

    @DisplayName("continue")
    @Test
    fun testContinue() {
        val list: MutableList<Int> = ArrayList()
        for (i in 0..5) {
            if (i == 2) {
                continue
            }
            list.add(i)
        }

        assertThat(list).hasSize(5)
            .contains(0, 1, 3, 4, 5)
    }

}