package io.arun.learning.springbootmongodbmysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.arun.learning.springbootmongodbmysql.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
