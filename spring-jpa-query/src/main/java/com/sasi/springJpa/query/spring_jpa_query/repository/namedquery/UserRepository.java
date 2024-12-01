/**
 * @author sasi
 *
 */
package com.sasi.springJpa.query.spring_jpa_query.repository.namedquery;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sasi.springJpa.query.spring_jpa_query.entity.User;

/**
 * 
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	List<User> findByEmailAddress(String emailAddress);

	List<User> findByLastname(String lastname);
}
