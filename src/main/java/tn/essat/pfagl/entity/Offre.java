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
public class Offre {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
private int disponibilite;
private int nombreTotaleCondidatDemande;
private String dateDebutLancment;
private String dateFinLancement ;
@ManyToOne(fetch = FetchType.EAGER)
@JoinColumn(name="idRecruteur")
private Recruteur recruteur;
public Offre() {
	super();
}
public Offre(Integer id, int disponibilite, int nombreTotaleCondidatDemande, String dateDebutLancment,
		String dateFinLancement, Recruteur recruteur) {
	super();
	this.id = id;
	this.disponibilite = disponibilite;
	this.nombreTotaleCondidatDemande = nombreTotaleCondidatDemande;
	this.dateDebutLancment = dateDebutLancment;
	this.dateFinLancement = dateFinLancement;
	this.recruteur = recruteur;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public int getDisponibilite() {
	return disponibilite;
}
public void setDisponibilite(int disponibilite) {
	this.disponibilite = disponibilite;
}
public int getNombreTotaleCondidatDemande() {
	return nombreTotaleCondidatDemande;
}
public void setNombreTotaleCondidatDemande(int nombreTotaleCondidatDemande) {
	this.nombreTotaleCondidatDemande = nombreTotaleCondidatDemande;
}
public String getDateDebutLancment() {
	return dateDebutLancment;
}
public void setDateDebutLancment(String dateDebutLancment) {
	this.dateDebutLancment = dateDebutLancment;
}
public String getDateFinLancement() {
	return dateFinLancement;
}
public void setDateFinLancement(String dateFinLancement) {
	this.dateFinLancement = dateFinLancement;
}
public Recruteur getRecruteur() {
	return recruteur;
}
public void setRecruteur(Recruteur recruteur) {
	this.recruteur = recruteur;
}


}
