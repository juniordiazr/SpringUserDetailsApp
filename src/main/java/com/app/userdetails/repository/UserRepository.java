package com.app.userdetails.repository;

import com.app.userdetails.model.User;

import java.util.Optional;

import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.app.userdetails.exception.ResourceNotFoundException;

/**
 * Created by juniordiazr on 05/12/22.
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	default User getUserByEmail(String email) {
		return findByEmail(email).orElseThrow(() -> new ResourceNotFoundException("User", "email", email));
	}

	Optional<User> findByEmail(@NotBlank String email);

}