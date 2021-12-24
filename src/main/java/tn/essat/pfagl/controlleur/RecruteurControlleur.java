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

import tn.essat.recrutmentpfa.entity.Metier;
import tn.essat.recrutmentpfa.entity.Recruteur;
import tn.essat.recrutmentpfa.service.IMetierService;
import tn.essat.recrutmentpfa.service.IRecruteurService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class RecruteurControlleur {
	@Autowired
	IRecruteurService iRecruteurService;
	@GetMapping("/getallRecruteurs")
	public List<Recruteur> getAllRecruteurs() {
		// TODO Auto-generated method stub
		return  iRecruteurService.getAllRecruteurs();
	}

	
	@PostMapping("/saverecruteur")
	public void save(@RequestBody Recruteur recruteur) {
		iRecruteurService.save(recruteur);;// TODO Auto-generated method stub
		
	}

	@DeleteMapping("deleterecruteur/{id}")
	public void remove(@PathVariable ("id") int id) {
iRecruteurService.remove(id);		
	}

	@GetMapping("getrecruteurbyid/{id}")
	public Optional<Recruteur> getRecruteurbyid(@PathVariable("id") int id) {
		// TODO Auto-generated method stub
		return iRecruteurService.getRecruteurbyid(id);
	}

	@PutMapping("/updaterecruteur")
	public Recruteur updateRecruteur (@RequestBody  Recruteur recruteur ) {
		// TODO Auto-generated method stub
		return iRecruteurService.updateRecruteur(recruteur);
	}

	@GetMapping("/countrecruteur")
	public Long count() {
		// TODO Auto-generated method stub
		return iRecruteurService.count();
	}

}
