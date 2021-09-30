package com.project.Example.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Example.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
