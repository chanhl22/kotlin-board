package hello.kotlinboard.grammar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class Variable {

    @DisplayName("변수")
    @Test
    fun variable() {
        var a: Int
        a = 123
        print(a)

        assertThat(a).isEqualTo(123)
    }

    @DisplayName("var - 가변")
    @Test
    fun useVar() {
        // 1. 초기화 후 값 변경 가능
        var name1 = "kotlin"
        name1 = "java"

        println("name1 : $name1")
        assertThat(name1).isEqualTo("java")


        // 2. 초기화 시 타입을 지정 했다면 다른 타입의 값을 넣는 것은 불가능
        var name2 = "kotlin"
        // name2 = 77 //Type mismatch 에러 발생
    }

    @DisplayName("val - 불변")
    @Test
    fun useVal() {
        // 1. val : value의 약어이며 변경 불가능(immutable)한 변수, 초기화만 가능
        val name = "Kotlin"
        // 이미 값이 할당 되었기 때문에 아래 코드처럼 값 할당 불가
        // name = "Java"


        // 2. 타입 지정 가능, 다만 1번처럼 컴파일러에서 타입이 추론 가능한 경우 생략 가능
        val name2: String = "Swift"
        // 초기화시 값을 할당하지 않을시엔 반드시 타입을 지정해야함
        val name3: String
        name3 = "Swift"
        assertThat(name2).isEqualTo("Swift")
        assertThat(name3).isEqualTo("Swift")


        // 3. 코드 문맥에 따라 val 변수가 1번만 초기화 되는것이 맞다면 여러 값을 초기화(할당) 가능
        val name4: String

        if (true) {
            name4 = "Anroid"
        } else {
            name4 = "iOS"
        }
        println("name4 : $name4")
        assertThat(name4).isEqualTo("Anroid")


        // 4. 변수의 참조가 가리키는 객체의 내부 값은 변경이 가능
        val nameArray = arrayListOf("Kotlin")
        nameArray.add("Java")
        println("nameArray : $nameArray")
        assertThat(nameArray).hasSize(2)
            .contains("Kotlin", "Java")
    }

}