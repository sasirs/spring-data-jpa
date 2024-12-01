/**
 * @author sasi
 *
 */
package com.sasi.springJpa.query.spring_jpa_query;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sasi.springJpa.query.spring_jpa_query.entity.User;
import com.sasi.springJpa.query.spring_jpa_query.repository.namedquery.UserRepository;

/**
 * 
 */

@SpringBootTest

public class NamedQueryTest {

	@Autowired
	UserRepository useRepository;

	@Test
	void saveUsers() {
		System.out.println("saving user");
		User user = new User();
		user.setActive(1);
		user.setAge(28);
		user.setEmailAddress("ramesh24@gmail.com");
		user.setFirstname("Ramesh");
		user.setLastname("Fadatare");
		user.setStartDate(new Date());
		user = useRepository.save(user);

		System.out.println("user saved successfully");
	}

	@Test
	void findByEmailAddress() {
		System.out.println("find by email");

		List<User> user2 = useRepository.findByEmailAddress("ramesh24@gmail.com");
		System.out.println(user2.toString());
	}
	
	
}
