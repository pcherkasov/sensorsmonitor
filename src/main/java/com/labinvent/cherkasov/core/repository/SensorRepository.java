package com.labinvent.cherkasov.core.repository;

import com.labinvent.cherkasov.core.model.Sensor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SensorRepository extends JpaRepository<Sensor, Long> {
    Optional<Sensor> findByName(String name);

    Page<Sensor> findAll(Pageable pageable);

    @Query("select s from Sensor s where lower(s.name) like lower(concat('%', :text, '%')) " +
            "or lower(s.model) like lower(concat('%', :text, '%')) " +
            "or lower(s.location) like lower(concat('%', :text, '%')) " +
            "or lower(s.type.name) like lower(concat('%', :text, '%')) " +
            "or lower(s.unit.name) like lower(concat('%', :text, '%')) " +
            "or lower(s.description) like lower(concat('%', :text, '%'))")
    Page<Sensor> searchInAllFields(@Param("text") String text, Pageable pageable);
}
