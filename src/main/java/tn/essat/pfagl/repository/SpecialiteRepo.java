package tn.essat.recrutmentpfa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.essat.recrutmentpfa.entity.Specialite;
@Repository
public interface SpecialiteRepo extends JpaRepository<Specialite, Integer>{

}
