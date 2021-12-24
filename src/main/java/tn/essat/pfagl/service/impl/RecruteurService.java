package tn.essat.recrutmentpfa.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.essat.recrutmentpfa.entity.Recruteur;
import tn.essat.recrutmentpfa.repository.RecruteurRepo;
import tn.essat.recrutmentpfa.service.IRecruteurService;

@Service
public class RecruteurService implements IRecruteurService {
@Autowired
RecruteurRepo recruteurRepo;
	@Override
	public List<Recruteur> getAllRecruteurs() {
		// TODO Auto-generated method stub
		return (List<Recruteur>) recruteurRepo;
	}

	@Override
	public void save(Recruteur r) {
		// TODO Auto-generated method stub
		recruteurRepo.save(r);
	}

	@Override
	public void remove(int id) {
		// TODO Auto-generated method stub
		recruteurRepo.deleteById(id);
	}

	@Override
	public Optional<Recruteur> getRecruteurbyid(int id) {
		// TODO Auto-generated method stub
		return recruteurRepo.findById(id);
	}

	@Override
	public Recruteur updateRecruteur(Recruteur recruteur) {
		// TODO Auto-generated method stub
		return recruteurRepo.save(recruteur);
	}

	@Override
	public Long count() {
		// TODO Auto-generated method stub
		return recruteurRepo.count();
	}

}
