package com.labinvent.cherkasov.api.converter;

import com.labinvent.cherkasov.api.converter.helper.TypeHelper;
import com.labinvent.cherkasov.api.converter.helper.UnitHelper;
import com.labinvent.cherkasov.api.dto.SensorDto;
import com.labinvent.cherkasov.core.model.Sensor;
import com.labinvent.cherkasov.core.model.Type;
import com.labinvent.cherkasov.core.model.Unit;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(injectionStrategy = InjectionStrategy.CONSTRUCTOR, componentModel = "spring")
public interface SensorConverter {

    default Sensor convert(final SensorDto sensorDto) {
        if (sensorDto == null) {
            return null;
        }
        return convertBase(sensorDto);
    }

    @Mapping(source = "type", target = "type", qualifiedByName = "setType")
    @Mapping(source = "unit", target = "unit", qualifiedByName = "setUnit")
    Sensor convertBase(final SensorDto sensorDto);

    @Named("setType")
    default Type setType(String name) {
        return new TypeHelper().getTypeByName(name);
    }

    @Named("setUnit")
    default Unit setUnit(String name) {
        return new UnitHelper().getUnitByName(name);
    }

    default SensorDto convert(final Sensor sensor) {
        if (sensor == null) {
            return null;
        }

        return convertBase(sensor);
    }

    @Mapping(source = "type", target = "type", qualifiedByName = "getType")
    @Mapping(source = "unit", target = "unit", qualifiedByName = "getUnit")
    SensorDto convertBase(final Sensor sensor);

    @Named("getType")
    default String getType(Type type) {
        return type.getName();
    }

    @Named("getUnit")
    default String getUnit(Unit unit) {
        return unit.getName();
    }
}
