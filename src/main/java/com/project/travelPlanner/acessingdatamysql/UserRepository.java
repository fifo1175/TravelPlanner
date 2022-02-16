package com.project.travelPlanner.acessingdatamysql;

import org.springframework.data.repository.CrudRepository;

import com.project.travelPlanner.acessingdatamysql.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// since it extends CrudRepository, it can access CRUD functionality

public interface UserRepository extends CrudRepository<User, Integer> {

}