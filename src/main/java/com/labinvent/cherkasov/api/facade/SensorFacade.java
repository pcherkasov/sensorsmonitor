package com.labinvent.cherkasov.api.facade;

import com.labinvent.cherkasov.api.converter.SensorConverter;
import com.labinvent.cherkasov.api.dto.SensorDto;
import com.labinvent.cherkasov.core.model.Sensor;
import com.labinvent.cherkasov.core.service.SensorService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SensorFacade {

    private final SensorService sensorService;
    private final SensorConverter sensorConverter;

    public Page<SensorDto> findAll(Pageable pageable) {
        return sensorService
                .findAll(pageable)
                .map(sensorConverter::convert);
    }

    public Page<SensorDto> findAll(String query, Pageable pageable) {
        return sensorService.searchAll(query, pageable)
                .map(sensorConverter::convert);
    }

    public SensorDto findById(long id) {
        return sensorConverter
                .convert(sensorService.findById(id));
    }

    public SensorDto findByName(String name) {
        return sensorConverter
                .convert(sensorService.findByName(name));
    }

    public SensorDto saveSensor(SensorDto sensorDto) {
        Sensor sensorFromDB = sensorService
                .save(sensorConverter.convert(sensorDto));
        return sensorConverter.convert(sensorFromDB);
    }

    public void deleteSensor(long id) {
        sensorService.deleteById(id);
    }
}
