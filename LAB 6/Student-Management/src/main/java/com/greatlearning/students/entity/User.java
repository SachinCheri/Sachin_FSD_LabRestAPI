package com.greatlearning.students.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {

   @Id
   @Column(name = "user_id")
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @Column(name="username")
   private String username;
   @Column(name="password")
   private String password;
    
   @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
   @JoinTable(
           name = "users_roles",
           joinColumns = @JoinColumn(name = "user_id"),
           inverseJoinColumns = @JoinColumn(name = "role_id")
           )
   private List<Role> roles = new ArrayList<>();

public User(String username, String password, List<Role> roles) {
	super();
	this.username = username;
	this.password = password;
	this.roles = roles;
}

public String getUsername() {
	return username;
}
public void setusername(String username) {
	this.username= username;
}
public String getPassword() {
	return password;
}
public void set(String Password) {
	this.password= Password;
}
public List<Role> getRoles() {
	return roles;
}
public void setroles(List<Role> roles) {
	this.roles= roles;
}	
			

public User() {
	super();
}
   
   
}
