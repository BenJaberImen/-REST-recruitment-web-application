package tn.essat.recrutmentpfa.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.essat.recrutmentpfa.entity.Offre;
import tn.essat.recrutmentpfa.entity.Recruteur;
import tn.essat.recrutmentpfa.repository.OffreRepo;
import tn.essat.recrutmentpfa.service.IOffreService;
@Service
public class OffreService implements IOffreService{
	@Autowired
	OffreRepo offreRepo;

	@Override
	public Optional<Offre> getoffreByRecruteur(Recruteur recruteur) {
		// TODO Auto-generated method stub
		return  offreRepo.findOffreByRecruteur(recruteur);
		}

	@Override
	public List<Offre> getAllOffres() {
		// TODO Auto-generated method stub
		return (List<Offre>) offreRepo.findAll();
	}

	@Override
	public void save(Offre of) {
		// TODO Auto-generated method stub
	offreRepo.save(of)	;
	}

	@Override
	public void remove(int id) {
		// TODO Auto-generated method stub
		offreRepo.deleteById(id);
	}

	@Override
	public Optional<Offre> getOffrebyid(int id) {
		// TODO Auto-generated method stub
		return offreRepo.findById(id);
	}

	@Override
	public Offre updateOffre(Offre of) {
		// TODO Auto-generated method stub
		return offreRepo.save(of);
	}

	@Override
	public Long count() {
		// TODO Auto-generated method stub
		return offreRepo.count();
	}
	

}
