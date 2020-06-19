package com.labinvent.cherkasov.api.converter;

import com.labinvent.cherkasov.api.dto.SensorDto;
import com.labinvent.cherkasov.core.model.Sensor;
import com.labinvent.cherkasov.core.model.Type;
import com.labinvent.cherkasov.core.model.Unit;
import com.labinvent.cherkasov.core.service.TypeService;
import com.labinvent.cherkasov.core.service.UnitService;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(injectionStrategy = InjectionStrategy.CONSTRUCTOR, componentModel = "spring")
public abstract class SensorConverter {

    @Autowired
    UnitService unitService;

    @Autowired
    TypeService typeService;

    public Sensor convert(final SensorDto sensorDto) {
        if (sensorDto == null) {
            return null;
        }
        return convertBase(sensorDto);
    }

    @Mapping(source = "type", target = "type", qualifiedByName = "setType")
    @Mapping(source = "unit", target = "unit", qualifiedByName = "setUnit")
    abstract Sensor convertBase(final SensorDto sensorDto);

    @Named("setType")
    Type setType(String name) {
        return typeService.findByName(name);
    }

    @Named("setUnit")
    Unit setUnit(String name) {
        return unitService.findByName(name);
    }

    public SensorDto convert(final Sensor sensor) {
        if (sensor == null) {
            return null;
        }

        return convertBase(sensor);
    }

    @Mapping(source = "type", target = "type", qualifiedByName = "getType")
    @Mapping(source = "unit", target = "unit", qualifiedByName = "getUnit")
    abstract SensorDto convertBase(final Sensor sensor);

    @Named("getType")
    String getType(Type type) {
        return type.getName();
    }

    @Named("getUnit")
    String getUnit(Unit unit) {
        return unit.getName();
    }
}
