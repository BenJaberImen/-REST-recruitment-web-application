package tn.essat.recrutmentpfa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.essat.recrutmentpfa.entity.Recruteur;

@Repository
public interface RecruteurRepo extends JpaRepository<Recruteur, Integer>{

}
