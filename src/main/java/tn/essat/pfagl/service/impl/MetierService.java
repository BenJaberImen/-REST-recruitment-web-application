package tn.essat.recrutmentpfa.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.essat.recrutmentpfa.entity.Metier;

import tn.essat.recrutmentpfa.repository.MetierRepo;
import tn.essat.recrutmentpfa.service.IMetierService;

@Service
public class MetierService implements IMetierService {
	@Autowired
	MetierRepo metierRepo;

	@Override
	public List<Metier> getallmetiers() {
		// TODO Auto-generated method stub
		return (List<Metier>) metierRepo.findAll();
	}

	@Override
	public void save(Metier m) {
		// TODO Auto-generated method stub
		metierRepo.save(m);
	}

	@Override
	public void remove(int id) {
		// TODO Auto-generated method stub
		metierRepo.deleteById(id);
	}

	@Override
	public Optional<Metier> getmetierbyid(int id) {
		// TODO Auto-generated method stub
		return metierRepo.findById(id);
	}

	@Override
	public Metier updateMetier(Metier m) {
		// TODO Auto-generated method stub
		return metierRepo.save(m);
	}

	@Override
	public Long count() {
		// TODO Auto-generated method stub
		return metierRepo.count();
	}

}
