package kz.narxoz.spring.app.repository;

import kz.narxoz.spring.app.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}