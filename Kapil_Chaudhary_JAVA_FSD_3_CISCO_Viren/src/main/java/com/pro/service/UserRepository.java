package com.pro.service;

import org.springframework.data.repository.CrudRepository;
import com.pro.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	

}
