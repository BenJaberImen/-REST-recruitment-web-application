package tn.essat.pfagl.repository;

import tn.essat.pfagl.entity.Role;
import tn.essat.pfagl.entity.ERole;

import java.util.Optional;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
	Optional<Role> findByRole(ERole role);
}
