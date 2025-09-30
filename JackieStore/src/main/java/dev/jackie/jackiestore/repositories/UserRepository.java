package dev.jackie.jackiestore.repositories;

import dev.jackie.jackiestore.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}

