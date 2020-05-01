package com.labinvent.cherkasov.core.service;

import com.labinvent.cherkasov.core.model.Sensor;

import java.util.List;

public interface SensorService {

    Sensor save(Sensor sensor);

    Sensor findById(long id);

    Sensor findByName(String name);

    List<Sensor> findAll();

    void deleteById(long id);
}
