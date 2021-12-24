package tn.essat.recrutmentpfa.service;

import java.util.List;
import java.util.Optional;

import tn.essat.recrutmentpfa.entity.Societe;

public interface ISocieteService {
	public List <Societe> getallsocietes();
	public void save(Societe s);
	public void remove(int id);
	public Optional <Societe> getsocietebyid(int id);
	 public Societe updateSociete(Societe s);
	 public Long count();
	
	
}
