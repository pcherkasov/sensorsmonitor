package com.labinvent.cherkasov.api.converter;

import com.labinvent.cherkasov.api.dto.UnitDto;
import com.labinvent.cherkasov.core.model.Unit;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(injectionStrategy = InjectionStrategy.CONSTRUCTOR, componentModel = "spring")
public interface UnitConverter {

    default Unit convert(final UnitDto unitDto) {
        if (unitDto == null) {
            return null;
        }
        return convertBase(unitDto);
    }

    Unit convertBase(final UnitDto unitDto);

    default UnitDto convert(final Unit unit) {
        if (unit == null) {
            return null;
        }
        return convertBase(unit);
    }

    UnitDto convertBase(final Unit unit);
}
