package com.dev.space.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.space.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
