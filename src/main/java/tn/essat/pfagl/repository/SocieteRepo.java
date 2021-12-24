package tn.essat.recrutmentpfa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.essat.recrutmentpfa.entity.Societe;
@Repository
public interface SocieteRepo  extends JpaRepository<Societe, Integer> {

}
