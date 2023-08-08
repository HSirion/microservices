package com.sirion.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sirion.entity.User;

@Repository
public interface LoginRepo extends JpaRepository<User,String>{

}
