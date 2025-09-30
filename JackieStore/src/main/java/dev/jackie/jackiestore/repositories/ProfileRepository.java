package dev.jackie.jackiestore.repositories;

import dev.jackie.jackiestore.entities.Profile;
import org.springframework.data.repository.CrudRepository;

public interface ProfileRepository extends CrudRepository<Profile, Long> {
}
