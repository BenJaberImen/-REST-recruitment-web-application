package tn.essat.recrutmentpfa.service;

import java.util.List;
import java.util.Optional;

import tn.essat.recrutmentpfa.entity.Offre;
import tn.essat.recrutmentpfa.entity.Recruteur;

public interface IOffreService {
	public Optional<Offre> getoffreByRecruteur(Recruteur recruteur);
	public List <Offre> getAllOffres();
	public void save(Offre of);
	public void remove(int id);
	public Optional <Offre> getOffrebyid(int id);
	 public Offre updateOffre(Offre of);
	 public Long count();

	

}
