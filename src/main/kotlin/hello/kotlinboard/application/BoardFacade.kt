package hello.kotlinboard.application

import hello.kotlinboard.domain.board.Board
import hello.kotlinboard.domain.board.BoardService
import hello.kotlinboard.domain.user.UserService
import org.springframework.stereotype.Service

@Service
class BoardFacade(
    private val boardService: BoardService,
    private val userService: UserService
) {
    fun create(userId: Long): Board {
        val user = userService.find(userId)
        return boardService.create(user)
    }

}