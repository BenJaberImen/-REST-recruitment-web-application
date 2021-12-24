package tn.essat.recrutmentpfa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.essat.recrutmentpfa.entity.Metier;

@Repository
public interface MetierRepo extends JpaRepository<Metier, Integer> {

}
