package hello.kotlinboard.grammar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class GrammarConditionalStatement {

    @DisplayName("if")
    @Test
    fun ifTest() {
        var a = 10
        if(a % 2  == 0){
            a = 2
        } else{
            a = 1
        }

        assertThat(a).isEqualTo(2)
    }

    @DisplayName("type diff")
    @Test
    fun typeDiffTest() {
        val a: Any = 1
        var result = "nothing"

        if(a is Int){
            result = "int"
        }

        if(a is String){
            result = "String"
        }

        assertThat(result).isEqualTo("int")
    }

    @DisplayName("when")
    @Test
    fun whenTest() {
        val result1 = exWhen(2)
        val result2 = exWhen(1)
        val result3 = exWhen("awd")

        assertThat(result1).isEqualTo("else")
        assertThat(result2).isEqualTo("1")
        assertThat(result3).isEqualTo("awd")
    }

    private fun exWhen(a: Any): String{
        return when(a){
            1 -> "1"
            "awd" -> "awd"
            else -> "else"
        }
    }

}