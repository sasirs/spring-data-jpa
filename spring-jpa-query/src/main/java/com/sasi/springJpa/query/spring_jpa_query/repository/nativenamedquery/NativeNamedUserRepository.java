/**
 * @author sasi
 *
 */
package com.sasi.springJpa.query.spring_jpa_query.repository.nativenamedquery;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sasi.springJpa.query.spring_jpa_query.entity.NativeUser;
 
/**
 * 
 */

@Repository
public interface NativeNamedUserRepository extends JpaRepository<NativeUser, Long> {
	
	NativeUser findByEmailAddress(String emailAddress);

	List<NativeUser> findByLastname(String lastname);
}
