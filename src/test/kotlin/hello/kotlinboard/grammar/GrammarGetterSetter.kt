package hello.kotlinboard.grammar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class GrammarGetterSetter {

    @DisplayName("Getter & Setter")
    @Test
    fun getterSetter() {
        val person1 = Person(10)
        val age = person1.age
        assertThat(age).isEqualTo(10)
        assertThat(person1.isAdult).isFalse()

        person1.age = 30
        assertThat(person1.isAdult).isTrue()
    }

    class Person(var age: Int) {
        var isAdult: Boolean
            get() = age >= 18
            set(value) {
                age = if (value) 18 else 0
            }
    }


}