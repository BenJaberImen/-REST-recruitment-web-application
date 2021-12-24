package tn.essat.recrutmentpfa.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.essat.recrutmentpfa.entity.Societe;
import tn.essat.recrutmentpfa.repository.SocieteRepo;
import tn.essat.recrutmentpfa.service.ISocieteService;

@Service
public class SocieteService implements ISocieteService {
@Autowired
SocieteRepo scociete; 
	@Override
	public List<Societe> getallsocietes() {
		// TODO Auto-generated method stub
		return (List<Societe>) scociete.findAll();
	}

	@Override
	public void save(Societe s) {
		// TODO Auto-generated method stub
		scociete.save(s);
	}

	@Override
	public void remove(int id) {
		// TODO Auto-generated method stub
		scociete.deleteById(id);
	}

	@Override
	public Optional<Societe> getsocietebyid(int id) {
		// TODO Auto-generated method stub
		return scociete.findById(id);
	}

	@Override
	public Societe updateSociete(Societe s) {
		// TODO Auto-generated method stub
		return scociete.save(s);
	}

	@Override
	public Long count() {
		// TODO Auto-generated method stub
		return scociete.count();
	}

}
