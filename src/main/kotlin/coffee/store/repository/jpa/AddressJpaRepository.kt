package coffee.store.repository.jpa

import coffee.store.entity.Address
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface AddressJpaRepository : CrudRepository<Address, Long>