/**
 * @author sasi
 *
 */
package com.sasi.springJpa.query.spring_jpa_query;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sasi.springJpa.query.spring_jpa_query.entity.NativeUser;
import com.sasi.springJpa.query.spring_jpa_query.repository.nativenamedquery.NativeNamedUserRepository;

/**
 * 
 */

@SpringBootTest
public class NativeNamedQueryTest {

	@Autowired
	NativeNamedUserRepository repo;
	
	@Test
	void findEmail() {
		   List < NativeUser > user3 = repo.findByLastname("Fadatare");
	        System.out.println(user3.get(0).toString());	
	}
}
