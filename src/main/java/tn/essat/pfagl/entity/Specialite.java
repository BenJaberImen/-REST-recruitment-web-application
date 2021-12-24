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
public class Specialite {

	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSpecialite;
private String dommaine;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="idMetier")
    private Metier metier;

	public Specialite() {
		super();
	}

	public Specialite(Integer idSpecialite, String dommaine, Metier metier) {
		super();
		this.idSpecialite = idSpecialite;
		this.dommaine = dommaine;
		this.metier = metier;
	}

	public Integer getIdSpecialite() {
		return idSpecialite;
	}

	public void setIdSpecialite(Integer idSpecialite) {
		this.idSpecialite = idSpecialite;
	}

	public String getDommaine() {
		return dommaine;
	}

	public void setDommaine(String dommaine) {
		this.dommaine = dommaine;
	}

	public Metier getMetier() {
		return metier;
	}

	public void setMetier(Metier metier) {
		this.metier = metier;
	}
    


	
}
