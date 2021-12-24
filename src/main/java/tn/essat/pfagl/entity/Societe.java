package tn.essat.recrutmentpfa.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table
public class Societe {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;
	    private String nom;
	    private String adress;
	    @ManyToOne(fetch = FetchType.EAGER)
	    @JoinColumn(name="idRecruteur")
	    private Recruteur recruteur;
		public Societe() {
			super();
		}
		public Societe(Integer id, String nom, String adress, Recruteur recruteur) {
			super();
			this.id = id;
			this.nom = nom;
			this.adress = adress;
			this.recruteur = recruteur;
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
		public String getAdress() {
			return adress;
		}
		public void setAdress(String adress) {
			this.adress = adress;
		}
		public Recruteur getRecruteur() {
			return recruteur;
		}
		public void setRecruteur(Recruteur recruteur) {
			this.recruteur = recruteur;
		}
}
