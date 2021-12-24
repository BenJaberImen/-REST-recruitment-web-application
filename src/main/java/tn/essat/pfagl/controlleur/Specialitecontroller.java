package tn.essat.recrutmentpfa.controlleur;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.essat.recrutmentpfa.entity.Specialite;
import tn.essat.recrutmentpfa.service.ISpecialiteService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class Specialitecontroller {
	@Autowired(required=true)
	ISpecialiteService iSpecialiteService;
	@GetMapping("/listespecialites")
	public List<Specialite> getallspecialite() {
		
		return iSpecialiteService.getallspecialite();
	}
	@PostMapping("/savespec")
	public void save(@RequestBody Specialite s) {
		// TODO Auto-generated method stub
		iSpecialiteService.save(s);
		
	}

@DeleteMapping("/removespec/{id}")
	public void remove(@PathVariable("id")int id) {
	iSpecialiteService.remove(id);
		// TODO Auto-generated method stub
		
	}

	@GetMapping("/getSpecialitebyid/{id}")
	public Optional<Specialite> getSpecialitebyid(@PathVariable("id")int id) {
		// TODO Auto-generated method stub
		return iSpecialiteService.getSpecialitebyid(id);
	}

	@PutMapping("/updateSpecialite")
	public Specialite updateSpecialite(@RequestBody Specialite s) {
		
		return iSpecialiteService.updateSpecialite(s);
	}

	@GetMapping("/countspec")
	public Long count() {
		// TODO Auto-generated method stub
		return iSpecialiteService.count();
	}
}
	
