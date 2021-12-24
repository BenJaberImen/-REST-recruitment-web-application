package tn.essat.pfagl.entity;

import javax.persistence.*;
import tn.essat.pfagl.entity.ERole;
 @Entity
    @Table(name = "roles")
    public class Role {
    	@Id
    	@GeneratedValue(strategy = GenerationType.IDENTITY)
    	private Integer id;

    	@Enumerated(EnumType.STRING)
    	@Column(length = 20 )
    	private ERole role;

    	public Role() {

    	}

    	public Role(ERole role) {
    		this.role = role;
    	}

    	public Integer getId() {
    		return id;
    	}

    	public void setId(Integer id) {
    		this.id = id;
    	}

    	public ERole getRole() {
    		return role;
    	}

    	public void setRole(ERole name) {
    		this.role = name;
    	}



}
