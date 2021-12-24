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

import tn.essat.recrutmentpfa.entity.Societe;
import tn.essat.recrutmentpfa.service.ISocieteService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class Societecontroller {
	@Autowired
	ISocieteService soc;
	@GetMapping("/listesociete")
	public List<Societe> getallsocietes() {
List<Societe> scList=soc.getallsocietes();
		return  soc.getallsocietes();
	}

	
	@PostMapping("/savesociete")
	public void save(@RequestBody Societe s) {
		soc.save(s);// TODO Auto-generated method stub
		
	}

	@DeleteMapping("deletesoc/{id}")
	public void remove(@PathVariable ("id") int id) {
soc.remove(id);		
	}

	@GetMapping("getsocietebyid/{id}")
	public Optional<Societe> getsocietebyid(@PathVariable("id") int id) {
		// TODO Auto-generated method stub
		return soc.getsocietebyid(id);
	}

	@PutMapping("/updateSociete")
	public Societe updateSociete(@RequestBody Societe s) {
		// TODO Auto-generated method stub
		return soc.updateSociete(s);
	}

	@GetMapping("/countsoc")
	public Long count() {
		// TODO Auto-generated method stub
		return soc.count();
	}
	
}
