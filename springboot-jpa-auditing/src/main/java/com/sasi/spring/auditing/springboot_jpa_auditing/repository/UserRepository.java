/**
 * @author sasi
 *
 */
package com.sasi.spring.auditing.springboot_jpa_auditing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sasi.spring.auditing.springboot_jpa_auditing.entity.User;

/**
 * 
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
