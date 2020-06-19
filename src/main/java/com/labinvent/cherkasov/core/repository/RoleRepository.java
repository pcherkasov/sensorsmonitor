package com.labinvent.cherkasov.core.repository;

import com.labinvent.cherkasov.core.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
