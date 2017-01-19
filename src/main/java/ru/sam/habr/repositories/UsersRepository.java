package ru.sam.habr.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.sam.habr.model.User;

public interface UsersRepository extends CrudRepository<User, Long>{
    User findByUsername(String username);

}
