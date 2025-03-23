package hello.kotlinboard.grammar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class GrammarNullSafe {

    @DisplayName("Safe Call Operator (?.)")
    @Test
    fun safeCallOperator() {
        val student = Student()
        student.name = "참새"
        val addressLength = student.displayAddressLength()
        assertThat(addressLength).isEqualTo("주소의 길이는: null 입니다.")

        student.address = "서울"
        val displayInfo = student.displayInfo()
        assertThat(displayInfo).isEqualTo("이름은: 참새 입니다. 주소는: 서울 입니다.")
    }

    @DisplayName("Elvis Operator (?:)")
    @Test
    fun elvisOperator() {
        val student = Student()
        student.name = "참새"
        val init = student.displayPleaseInit()
        assertThat(init).isEqualTo("주소의 길이는: 초기화하세요 입니다")

        student.address = "서울"
        val displayInfo = student.displayInfo()
        assertThat(displayInfo).isEqualTo("이름은: 참새 입니다. 주소는: 서울 입니다.")
    }

    class Student {
        lateinit var name:String
        var address:String? = null

        fun displayInfo(): String {
            return "이름은: $name 입니다. 주소는: $address 입니다."
        }

        fun displayAddressLength(): String {
            return "주소의 길이는: ${address?.length} 입니다."
        }

        fun displayPleaseInit(): String {
            return "주소의 길이는: ${address?.length ?: "초기화하세요"} 입니다"
        }
    }

}