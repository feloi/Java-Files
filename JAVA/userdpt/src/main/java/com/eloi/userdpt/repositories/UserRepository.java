package com.eloi.userdpt.repositories;

import com.eloi.userdpt.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
