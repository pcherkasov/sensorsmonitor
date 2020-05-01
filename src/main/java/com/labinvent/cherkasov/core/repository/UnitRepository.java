package com.labinvent.cherkasov.core.repository;

import com.labinvent.cherkasov.core.model.Unit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnitRepository extends JpaRepository<Unit, Long> {
}
