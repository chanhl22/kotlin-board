package hello.kotlinboard.hello

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface HelloRepository: CrudRepository<HelloEntity, Long> {
}