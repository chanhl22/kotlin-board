package hello.kotlinboard.grammar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class GrammarClass {

    @DisplayName("주 생성자")
    @Test
    fun primaryConstructor() {
        //given
        val person1 = Person1("kotlin", 20)
        val person2 = Person2("kotlin", 20)
        val person3 = Person3("kotlin", 20)
        val person4 = Person4("kotlin", 20)

        //when
        person1.age

        //then
        assertThat(person1.name).isEqualTo("kotlin")
        assertThat(person1.age).isEqualTo(20)
        assertThat(person2.name).isEqualTo("spring")
        assertThat(person2.age).isEqualTo(10)
        assertThat(person3.name).isEqualTo("kotlin")
        assertThat(person3.age).isEqualTo(20)
        assertThat(person4.name).isEqualTo("kotlin")
        assertThat(person4.age).isEqualTo(20)
    }

    @DisplayName("주 생성자에 var? val?")
    @Test
    fun primaryConstructorVarOrVal() {
        //given
        val person1 = Person1("kotlin", 20)

        //when
        // person1.name = "new" //컴파일 오류
        person1.age = 200

        //then
        assertThat(person1.age).isEqualTo(200)
    }

    @DisplayName("class")
    @Test
    fun testClass() {
        val person = Prs("Alice", 30)
        person.addAge()

        // 속성 검증
        assertThat(person.name).isEqualTo("Alice")
        assertThat(person.birth).isEqualTo(31)
    }

    @DisplayName("class1")
    @Test
    fun testClass1() {
        val character = Character("Alice", "black", 30.0)

        // 속성 검증
        assertThat(character.name).isEqualTo("Alice")
        assertThat(character.hairColor).isEqualTo("black")
        assertThat(character.height).isEqualTo(30.0)
    }

}

class Person1(val name: String, var age: Int) {
    // 클래스 본체
}

class Person2(name: String, age: Int) {
    var name = "spring"
    var age = 10

    init {
        println("이름은? $name")
        println("이름은? ${this.name}")
        println("이름은? $this.name")
    }

    init {
        println("2 ------")
        println("이름은? $name")
        println("이름은? ${this.name}")
        println("이름은? $this.name")
    }
}

class Person3 constructor(val name: String, var age: Int) {
    // 클래스 본체
}

class Person4 {
    var name: String = "spring"
    var age: Int = 10

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }
}

class Prs(var name: String, var birth: Int) {
    fun addAge() {
        birth++
    }
}

class Character(name: String, hairColor: String, height: Double) {
    var name: String = ""
    var hairColor: String = ""
    var height: Double = 0.0

    init {
        println("$name $hairColor $height")
    }
}