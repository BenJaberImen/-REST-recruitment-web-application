package tn.essat.recrutmentpfa.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table
public class Recruteur extends User  {
	
	private Integer id;
private String poste;
	 @JsonIgnore
		@OneToMany (cascade = CascadeType.ALL,mappedBy = "recruteur")
		private List <Societe> liste;
	 
	 @JsonIgnore
		@OneToMany (cascade = CascadeType.ALL,mappedBy = "recruteur")
		private List <Offre> offre;
	
	
	public Recruteur() {
		super();
	}


	public Recruteur(Integer idUser, String firstName, String lastName, String adress, String email, String numTel,
			String role, Integer id, String poste, List<Societe> liste, List<Offre> offre) {
		super(idUser, firstName, lastName, adress, email, numTel, role);
		this.id = id;
		this.poste = poste;
		this.liste = liste;
		this.offre = offre;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getPoste() {
		return poste;
	}


	public void setPoste(String poste) {
		this.poste = poste;
	}


	public List<Societe> getListe() {
		return liste;
	}


	public void setListe(List<Societe> liste) {
		this.liste = liste;
	}


	public List<Offre> getOffre() {
		return offre;
	}


	public void setOffre(List<Offre> offre) {
		this.offre = offre;
	}


	
	

}
