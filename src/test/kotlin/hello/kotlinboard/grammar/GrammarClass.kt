package hello.kotlinboard.grammar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class GrammarClass {

    @DisplayName("class")
    @Test
    fun testClass() {
        val person = Prs("Alice", 30)
        person.addAge()

        // 속성 검증
        assertThat(person.name).isEqualTo("Alice")
        assertThat(person.birth).isEqualTo(31)
    }

}

class Prs(var name: String, var birth: Int) {
    fun addAge() {
        birth++
    }
}