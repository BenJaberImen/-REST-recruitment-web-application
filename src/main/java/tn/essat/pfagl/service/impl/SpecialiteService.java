package tn.essat.recrutmentpfa.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.essat.recrutmentpfa.entity.Specialite;
import tn.essat.recrutmentpfa.repository.SpecialiteRepo;
import tn.essat.recrutmentpfa.service.ISpecialiteService;
@Service
public class SpecialiteService implements ISpecialiteService {

	
	
	@Autowired
	SpecialiteRepo spe;

	@Override
	public List<Specialite> getallspecialite() {
		// TODO Auto-generated method stub
		return (List<Specialite>) spe.findAll() ;
	}

	@Override
	public void save(Specialite s) {
		// TODO Auto-generated method stub
		spe.save(s);
	}

	@Override
	public void remove(int id) {
		// TODO Auto-generated method stub
		spe.deleteById(id);
	}

	@Override
	public Optional<Specialite> getSpecialitebyid(int id) {
		// TODO Auto-generated method stub
		return spe.findById(id);
	}

	@Override
	public Specialite updateSpecialite(Specialite s) {
		// TODO Auto-generated method stub
		return spe.save(s);
	}

	@Override
	public Long count() {
		// TODO Auto-generated method stub
		return spe.count();
	}

	
	
}
