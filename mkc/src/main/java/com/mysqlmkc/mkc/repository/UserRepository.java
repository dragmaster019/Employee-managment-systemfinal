package com.mysqlmkc.mkc.repository;

import com.mysqlmkc.mkc.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>{
}
