/**
 * @author sasi
 *
 */
package com.sasi.springJpa.query.spring_jpa_query.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQueries;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.Table;

/**
 * 
 */

@Entity
@Table(name = "users")
@NamedNativeQuery(name = "NativeUser.findByEmailAddress", query = "select * from users where email_address = ?1", resultClass = User.class)
@NamedNativeQueries(value = { @NamedNativeQuery(name = "NativeUser.findByLastname", query = "select * from users where lastname = ?1", resultClass = User.class) })

public class NativeUser {
	private long id;
	private String firstname;
	private String lastname;
	private Date startDate;
	private String emailAddress;
	private int age;
	private int active;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", startDate=" + startDate + ", emailAddress=" + emailAddress + ", age=" + age + ", active=" + active + "]";
	}
}
