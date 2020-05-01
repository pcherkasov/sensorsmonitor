package com.labinvent.cherkasov.api.converter;

import com.labinvent.cherkasov.api.dto.SensorDto;
import com.labinvent.cherkasov.core.model.Sensor;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(injectionStrategy = InjectionStrategy.CONSTRUCTOR, componentModel = "spring")
public interface SensorConverter {

    default Sensor convert(final SensorDto sensorDto) {
        if (sensorDto == null) {
            return null;
        }
        return convertBase(sensorDto);
    }

    Sensor convertBase(final SensorDto sensorDto);


    default SensorDto convert(final Sensor sensor) {
        if (sensor == null) {
            return null;
        }

        return convertBase(sensor);
    }


    SensorDto convertBase(final Sensor sensor);
}
