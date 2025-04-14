package hello.kotlinboard.domain.board

import hello.kotlinboard.domain.user.User
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.ArgumentMatchers
import org.mockito.BDDMockito
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.times
import org.mockito.junit.jupiter.MockitoExtension
import org.mockito.kotlin.any

@ExtendWith(MockitoExtension::class)
class BoardServiceTest {

    @Mock
    private lateinit var boardRepository: BoardRepository

    @InjectMocks
    private lateinit var boardService: BoardService

    @DisplayName("게시판을 생성한다.")
    @Test
    fun create() {
        //given
        val user = User(1L, "테스트")
        val board = Board(1L, "테스트 게시판")

        //any(...) must not be null
//        BDDMockito.given(boardRepository.save(ArgumentMatchers.any()))
//            .willReturn(board)

        //any(...) must not be null
//        BDDMockito.given(boardRepository.save(ArgumentMatchers.any(Board::class.java)))
//            .willReturn(board)

        //Strict stubbing argument mismatch.
//        BDDMockito.given(boardRepository.save(board))
//            .willReturn(board)

        BDDMockito.given(boardRepository.save(any()))
            .willReturn(board)

        //when
        boardService.create(user)

        //then
        Mockito.verify(boardRepository, times(1))
            .save(any())
    }

}