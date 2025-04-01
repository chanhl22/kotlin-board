package hello.kotlinboard.domain.board

import hello.kotlinboard.domain.user.User
import org.springframework.stereotype.Service

@Service
class BoardService(
    private val boardRepository: BoardRepository
) {
    fun create(user: User): Board {
        val board = Board(1L, "게시판")
        val savedBoard = boardRepository.save(board)
        return savedBoard
    }

}