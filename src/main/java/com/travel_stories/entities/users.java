package com.travel_stories.entities;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
//@NamedQueries(
//		value = {
//				@NamedQuery(
//						name = "users.findMaxAge",
//						query = "SELECT max(p.age) FROM users p"),
////				@NamedQuery(
////						name = "users.recordsMaxAgeByCountry",
////						query = "SELECT x FROM users x WHERE x.age = (SELECT max(p.age) FROM users p where p.country_id = ?1)")
//				})
@Table(name = "Users")
public class users {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int userid;
	@Column(name = "username")
	private String username;
	@Column(name = "email")
	private String email;
	@Column(name = "first_name")
	private String first_name;
	@Column(name = "last_name")
	private String last_name;
//	@Column(name = "age")
//	private int age;
	@Column(name = "pswd")
	private String pswd;
//	@Column(name = "city_id")
//	private int city_id;
	
//	@Column(name = "country_id")
//	private int country_id;
	@Column(name = "user_role")
	private int user_role;

	public int getUser_id() {
		return userid;
	}
	public void setUser_id(int user_id) {
		this.userid = user_id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
//	public int getCity_id() {
//		return city_id;
//	}
//	public void setCity_id(int city_id) {
//		this.city_id = city_id;
//	}
//	public int getCountry_id() {
//		return country_id;
//	}
//	public void setCountry_id(int country_id) {
//		this.country_id = country_id;
//	}
	public int getUser_role() {
		return user_role;
	}
	public void setUser_role(int user_role) {
		this.user_role = user_role;
	}	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public users(int user_id, String username, String email, String first_name, String last_name, int age, String pswd,
			 int user_role) {
		super();
		this.userid = user_id;
		this.username = username;
		this.email = email;
		this.first_name = first_name;
		this.last_name = last_name;
//		this.age = age;
		this.pswd = pswd;
//		this.city_id = city_id;
//		this.country_id = country_id;
		this.user_role = user_role;
	}
	public users() {
		// TODO Auto-generated constructor stub
	}
	
	
	
}
