package hello.kotlinboard.hello

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers

@WebMvcTest(controllers = [HelloController::class])
class HelloControllerTest {

    @Autowired
    private lateinit var mockMvc: MockMvc

    @DisplayName("hello가 리턴된다.")
    @Test
    fun hello() {
        // when // then
        mockMvc.perform(
            MockMvcRequestBuilders.get("/hello")
                .contentType(MediaType.APPLICATION_JSON)
        )
            .andExpect(MockMvcResultMatchers.status().isOk)
    }
}