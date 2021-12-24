package tn.essat.recrutmentpfa.service;
import java.util.List;
import java.util.Optional;

import tn.essat.recrutmentpfa.entity.Specialite;
public interface ISpecialiteService {

	public List <Specialite> getallspecialite();
	public void save(Specialite s);
	public void remove(int id);
	public Optional <Specialite> getSpecialitebyid(int id);
	 public Specialite updateSpecialite(Specialite s);
	 public Long count();
	
}
