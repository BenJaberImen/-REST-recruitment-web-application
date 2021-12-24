package tn.essat.pfagl.entity;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;


@Table(name = "users")
@Entity
public class User {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id;
	    @Column(nullable = false, unique = true, length = 45)
	    private String login;
	    @Column(nullable = false, unique = true, length = 45)
	    private String email;
	    @Column(nullable = false, length = 64)
	    private String password;
	    
	    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id", nullable = false), inverseJoinColumns = @JoinColumn(name = "role_id", nullable = false))
private Set<Role> roles = new HashSet<>();
	    public User() {
	    }
		public User(long id, String login, String email, String password, 
				Set<Role> roles) {
			super();
			this.id = id;
			this.login = login;
			this.email = email;
			this.password = password;
			//this.firstName = firstName;
			//this.lastName = lastName;
			this.roles = roles;
		}
		public User(String login, String email, String password) {
			super();
			this.login = login;
			this.email = email;
			this.password = password;
			//this.firstName = firstName;
			//this.lastName = lastName;
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getLogin() {
			return login;
		}
		public void setLogin(String login) {
			this.login = login;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
		public Set<Role> getRoles() {
			return roles;
		}
		public void setRoles(Set<Role> roles) {
			this.roles = roles;
		}
		
		

}