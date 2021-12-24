package tn.essat.pfagl.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.essat.pfagl.entity.User;

@Repository
public interface UserRepo extends  JpaRepository<User, Integer> {
	Optional<User> findByLogin(String login);
	Boolean existsByLogin(String login);

	Boolean existsByEmail(String email);



















}
