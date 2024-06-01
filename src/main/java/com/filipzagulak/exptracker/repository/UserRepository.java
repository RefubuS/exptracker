package com.filipzagulak.exptracker.repository;

import com.filipzagulak.exptracker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

}
