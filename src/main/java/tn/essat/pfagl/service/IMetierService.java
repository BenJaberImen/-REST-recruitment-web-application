package tn.essat.recrutmentpfa.service;

import java.util.List;
import java.util.Optional;

import tn.essat.recrutmentpfa.entity.Metier;


public interface IMetierService {


	public List <Metier> getallmetiers();
	public void save(Metier m);
	public void remove(int id);
	public Optional <Metier> getmetierbyid(int id);
	 public Metier updateMetier(Metier m);
	 public Long count();
	





}
