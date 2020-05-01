package com.labinvent.cherkasov.api.facade;

import com.labinvent.cherkasov.api.converter.SensorConverter;
import com.labinvent.cherkasov.api.dto.SensorDto;
import com.labinvent.cherkasov.core.model.Sensor;
import com.labinvent.cherkasov.core.service.SensorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SensorFacade {

    private final SensorService sensorService;
    private final SensorConverter sensorConverter;

    public List<SensorDto> findAll() {
        List<Sensor> sensorsFromDb = sensorService.findAll();
        return sensorsFromDb
                .stream()
                .map(sensorConverter::convert)
                .collect(Collectors.toList());
    }
}
