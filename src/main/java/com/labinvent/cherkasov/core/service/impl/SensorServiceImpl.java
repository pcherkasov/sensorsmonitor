package com.labinvent.cherkasov.core.service.impl;

import com.labinvent.cherkasov.core.exception.ResourceNotFoundException;
import com.labinvent.cherkasov.core.model.Sensor;
import com.labinvent.cherkasov.core.repository.SensorRepository;
import com.labinvent.cherkasov.core.service.SensorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SensorServiceImpl implements SensorService {

    private final SensorRepository sensorRepository;

    @Override
    public Sensor save(Sensor sensor) {
        return sensorRepository.save(sensor);
    }

    @Override
    public Sensor findById(long id) {
        return sensorRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Sensor", "id", id));
    }

    @Override
    public Sensor findByName(String name) {
        return sensorRepository
                .findByName(name)
                .orElseThrow(() -> new ResourceNotFoundException("Sensor", "name", name));
    }

    @Override
    public List<Sensor> findAll() {
        return sensorRepository.findAll();
    }

    @Override
    public void deleteById(long id) {
        Sensor sensor = sensorRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Sensor", "id", id));
        sensor.setDeleted(true);
        sensorRepository.save(sensor);
    }
}
