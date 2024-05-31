package com.filipzagulak.exptracker.repository;

import com.filipzagulak.exptracker.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {

}
