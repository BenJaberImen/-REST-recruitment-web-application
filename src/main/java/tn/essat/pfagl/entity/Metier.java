package tn.essat.recrutmentpfa.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table

public class Metier {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nom;
	 @JsonIgnore
		@OneToMany (cascade = CascadeType.ALL,mappedBy = "metier")
		private List <Specialite> liste;
	public Metier() {
		super();
	}

	public Metier(Integer id, String nom, List<Specialite> liste) {
		super();
		this.id = id;
		this.nom = nom;
		this.liste = liste;
	}

	public List<Specialite> getListe() {
		return liste;
	}

	public void setListe(List<Specialite> liste) {
		this.liste = liste;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

}
