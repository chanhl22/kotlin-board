package hello.kotlinboard.domain.user

import org.springframework.stereotype.Service

@Service
class UserService {
    fun find(userId: Long): User {
        return User(1L, "phael")
    }

}