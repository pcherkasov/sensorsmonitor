package com.labinvent.cherkasov.core.service;

import com.labinvent.cherkasov.core.model.Sensor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface SensorService {

    Sensor save(Sensor sensor);

    Sensor findById(long id);

    Sensor findByName(String name);

    List<Sensor> findAll();

    Page<Sensor> findAll(Pageable pageable);

    Page<Sensor> searchAll(String text,Pageable pageable);

    void deleteById(long id);
}
