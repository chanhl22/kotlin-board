package hello.kotlinboard.domain.board

import org.springframework.stereotype.Repository

@Repository
interface BoardRepository {

    fun save(board: Board): Board

}
