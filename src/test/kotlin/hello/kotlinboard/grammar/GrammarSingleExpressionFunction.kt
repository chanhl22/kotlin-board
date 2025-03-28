package hello.kotlinboard.grammar

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class GrammarSingleExpressionFunction {

    @DisplayName("Single Expression Function")
    @Test
    fun singleExpressionFunctionTest() {
        fun add1(num1: Int, num2: Int, num3: Int): Int {
            return (num1 + num2 + num3) / 3
        }
        println("평균값은 ${add1(10, 20, 30)}입니다")

        var add2 = { num1: Int, num2: Int, num3: Int -> (num1 + num2 + num3) / 3 }
        println("평균값은 ${add2(10, 20, 30)}입니다")

        fun add3(num1: Int, num2: Int, num3: Int) = (num1 + num2 + num3) / 3
        println("평균값은 ${add3(10, 20, 30)}입니다")
    }


}