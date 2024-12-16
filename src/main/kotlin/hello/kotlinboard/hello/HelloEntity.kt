package hello.kotlinboard.hello

import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EntityListeners
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime

@Entity
@EntityListeners(AuditingEntityListener::class)
class HelloEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @get:JsonProperty
    var id: Long? = null

    var message: String = ""

    @CreatedDate
    @Column(nullable = true, updatable = false)
    @get:JsonProperty
    var createdDate: LocalDateTime? = null

    @LastModifiedDate
    @Column(nullable = true)
    @get:JsonProperty
    var lastModifiedDate: LocalDateTime? = null

}