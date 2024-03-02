package com.tamerlanishmaev.microbank.repository;


import com.tamerlanishmaev.microbank.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

}
