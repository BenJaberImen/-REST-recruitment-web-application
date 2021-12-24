package tn.essat.recrutmentpfa.service;

import java.util.List;
import java.util.Optional;


import tn.essat.recrutmentpfa.entity.Recruteur;

public interface IRecruteurService {
	public List <Recruteur> getAllRecruteurs();
	public void save(Recruteur r);
	public void remove(int id);
	public Optional <Recruteur> getRecruteurbyid(int id);
	 public Recruteur updateRecruteur(Recruteur recruteur);
	 public Long count();

}
