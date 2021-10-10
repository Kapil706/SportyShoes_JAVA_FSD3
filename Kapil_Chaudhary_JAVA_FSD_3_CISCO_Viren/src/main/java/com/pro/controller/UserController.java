package com.pro.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pro.model.User;
import com.pro.service.UserRepository;


@RestController
@RequestMapping("users")
public class UserController
{
	@Autowired
	UserRepository userrepository;
		   
			// update existing product 
			@PutMapping("userupdate/{id}")
			public User updatUser(@RequestBody User user)
			{
/*				return userrepository.findById(id).map(user -> {
		            user.setUsername(newUser.getUsername());
		            user.setPassword(newUser.getPassword());
		            user.setEmail(newUser.getEmail());
		            user.setPhone_number(newUser.getPhone_number());
		            user.setUserID(newUser.getUserID());
		            return userrepository.save(user);
		        }).orElseGet(() -> {
		            newUser.setUserID(id);
		            return userrepository.save(newUser);
		        });
*/				
				return userrepository.save(user);
			}

			// delete particular product from database
			@DeleteMapping("userdelete/{userID}")
			public void deleteUser(@PathVariable int userID)
			{
				userrepository.deleteById(userID);
			}
			
			// retrieve all user from database
			@GetMapping("userall")
			public List<User> getAllUser()
			{
				List<User> user=(List<User>) userrepository.findAll(); 
				return user;
			}
}		
	