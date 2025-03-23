package hello.kotlinboard.grammar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class GrammarArray {

    @DisplayName("배열")
    @Test
    fun createArray() {
        //int형으로 1 2 3 4 배열 생성
        val intArr: Array<Int> = arrayOf(1, 2, 3, 4)
        print(intArr[0])
        assertThat(intArr).hasSize(4)
            .contains(1, 2, 3, 4)

        //type 생략 가능
        val intArr2 = arrayOfNulls<Int>(5)
        print(intArr2[1])
        assertThat(intArr2).hasSize(5)
            .contains(null, null, null, null, null)

        //Any는 데이터 타입의 최상위(어느 데이터든 다 들어갈 수 있음)
        val anyArr: Array<Any> = arrayOf(1, "awd", 3.2, 4)
        print(anyArr[1])
        assertThat(anyArr).hasSize(4)
            .contains(1, "awd", 3.2, 4)


        val array1 = Array(3, { i -> i })
        assertThat(array1[0]).isEqualTo(0)
        assertThat(array1[1]).isEqualTo(1)
        assertThat(array1[2]).isEqualTo(2)

        val array2 = Array(3, { _ -> 0 })
        assertThat(array2[0]).isEqualTo(0)
        assertThat(array2[1]).isEqualTo(0)
        assertThat(array2[2]).isEqualTo(0)

        val array3 = Array(3, { 0 })
        assertThat(array3[0]).isEqualTo(0)
        assertThat(array3[1]).isEqualTo(0)
        assertThat(array3[2]).isEqualTo(0)

        val array4 = Array(3) { 0 }
        assertThat(array4[0]).isEqualTo(0)
        assertThat(array4[1]).isEqualTo(0)
        assertThat(array4[2]).isEqualTo(0)
    }

    @DisplayName("2차원 배열")
    @Test
    fun createArray2() {
        //2차원 배열 선언
        val array = Array(3) { IntArray(size = 3, init = { i -> i } ) }

        //출력값
        for ((i, row) in array.withIndex()){
            for ((j,column) in row.withIndex()){
                print("[$i,$j] => $column\t")
            }
            println()
        }
    }

}