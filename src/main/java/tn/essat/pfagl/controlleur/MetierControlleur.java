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
import tn.essat.recrutmentpfa.service.IMetierService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class MetierControlleur {
	@Autowired
	IMetierService iMetierService;
	@GetMapping("/listemetiers")
	public List<Metier> getallmetiers() {
		// TODO Auto-generated method stub
		return  iMetierService.getallmetiers();
	}

	
	@PostMapping("/savemetier")
	public void save(@RequestBody Metier m) {
		iMetierService.save(m);;// TODO Auto-generated method stub
		
	}

	@DeleteMapping("deletemetier/{id}")
	public void remove(@PathVariable ("id") int id) {
iMetierService.remove(id);		
	}

	@GetMapping("getmetierbyid/{id}")
	public Optional<Metier> getmetierbyid(@PathVariable("id") int id) {
		// TODO Auto-generated method stub
		return iMetierService.getmetierbyid(id);
	}

	@PutMapping("/updatemetier")
	public Metier updateMetier (@RequestBody  Metier m) {
		// TODO Auto-generated method stub
		return iMetierService.updateMetier(m);
	}

	@GetMapping("/countmetier")
	public Long count() {
		// TODO Auto-generated method stub
		return iMetierService.count();
	}
}
