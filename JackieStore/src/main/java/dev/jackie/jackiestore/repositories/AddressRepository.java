package dev.jackie.jackiestore.repositories;

import dev.jackie.jackiestore.entities.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}
