package hello.kotlinboard.grammar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class GrammarLoop {

    @DisplayName("while")
    @Test
    fun testWhile() {
        var i = 0
        while (i < 10) {
            i++
        }

        assertThat(i).isEqualTo(10)
    }

    @DisplayName("for")
    @Test
    fun testFor() {
        val list1: MutableList<Int> = mutableListOf()
        for (i in 0..3) {
            list1.add(i)
        }

        val list2: MutableList<Int> = mutableListOf()
        for (i in 3 downTo 0) {
            list2.add(i)
        }

        val list3: MutableList<Int> = mutableListOf()
        for (i in 0..5 step 2) {
            list3.add(i)
        }

        val list4: MutableList<Char> = mutableListOf()
        for (i in 'a'..'e') {
            list4.add(i)
        }

        assertThat(list1).hasSize(4)
            .contains(0, 1, 2, 3)
        assertThat(list2).hasSize(4)
            .contains(3, 2, 1, 0)
        assertThat(list3).hasSize(3)
            .contains(0, 2, 4)
        assertThat(list4).hasSize(5)
            .contains('a', 'b', 'c', 'd', 'e')
    }

}