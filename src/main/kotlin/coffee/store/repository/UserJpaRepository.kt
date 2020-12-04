package coffee.store.repository

import coffee.store.entity.User
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import java.util.*

interface UserJpaRepository : CrudRepository<User, Long> {
    @Query(
            value = "select * from клиент where телефон = ?",
            countQuery = "select count(*) from клиент",
            nativeQuery = true)
    fun findByPhone(phone: String): Optional<User>
}