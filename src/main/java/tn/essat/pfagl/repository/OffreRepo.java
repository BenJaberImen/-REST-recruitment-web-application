package tn.essat.recrutmentpfa.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.essat.recrutmentpfa.entity.Offre;
import tn.essat.recrutmentpfa.entity.Recruteur;

@Repository
public interface OffreRepo extends JpaRepository<Offre, Integer> {

    public Optional<Offre> findOffreByRecruteur(Recruteur recruteur);
	

}
