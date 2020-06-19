package com.labinvent.cherkasov.core.repository;

import com.labinvent.cherkasov.core.model.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TypeRepository extends JpaRepository<Type, Long> {
    Optional<Type> findByName(String name);
}
