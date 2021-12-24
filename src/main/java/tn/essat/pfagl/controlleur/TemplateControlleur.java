package tn.essat.recrutmentpfa.controlleur;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import java.util.List;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tn.essat.recrutmentpfa.entity.Metier;
import tn.essat.recrutmentpfa.entity.Societe;
import tn.essat.recrutmentpfa.entity.Specialite;
import tn.essat.recrutmentpfa.service.IMetierService;
import tn.essat.recrutmentpfa.service.ISocieteService;
import tn.essat.recrutmentpfa.service.ISpecialiteService;

@Controller
public class TemplateControlleur {
	
	
	@Autowired
	
ISocieteService iSocieteService;
	
	@Autowired
	
	ISpecialiteService iSpecialiteService;
	@Autowired
	IMetierService im;

	 @RequestMapping(value = {"/societe"}, method = RequestMethod.GET)
	 public String viewTravailleursPage() {
      return "listesociete";
  }
	 @RequestMapping(value = { "/listesocietes" }, method = RequestMethod.GET)
	    public String allSociete(Model model) {
		
		 List< Societe> societes = iSocieteService.getallsocietes();
		 model.addAttribute("societes", societes);
	        
	 
	        return "listesociete";
	    }

    @RequestMapping(value = {"/specialite"}, method = RequestMethod.GET)
public String viewspecialitePage() {
    return "listespecialite";
}
	 @RequestMapping(value = { "/listespecialites" }, method = RequestMethod.GET)
	    public String allSpecialite(Model model) {
		
		 List< Specialite>  specialites = iSpecialiteService.getallspecialite();
		 model.addAttribute("specialites", specialites);
	        return "listespecialite";
	    }
	 @RequestMapping(value = {"/metier"}, method = RequestMethod.GET)
	 public String viewmetierPage() {
	     return "listemetier";
	 }
	 	 @RequestMapping(value = { "/listemetiers" }, method = RequestMethod.GET)
	 	    public String allMetier(Model model) {
	 		
	 		 List< Metier>  metiers = im.getallmetiers();
	 		 model.addAttribute("metiers", metiers);
	 	        return "listemetier";
	 	    }
	
	 @RequestMapping(value = {"/AjouterSociete"}, method = RequestMethod.GET)
 	 public String adminAjouterService() {
       return "AdminAjouterService";
   }

	    @RequestMapping(value = {"/AdminModifierService1"}, method = RequestMethod.GET)
	 	 public String AdminModifierService() {
	       return "AdminModifierService";
	   }
	     

}
	 
	
