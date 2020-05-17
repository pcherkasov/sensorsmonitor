package com.labinvent.cherkasov.api.converter;

import com.labinvent.cherkasov.api.dto.TypeDto;
import com.labinvent.cherkasov.core.model.Type;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(injectionStrategy = InjectionStrategy.CONSTRUCTOR, componentModel = "spring")
public interface TypeConverter {

    default Type convert(final TypeDto typeDto) {
        if (typeDto == null) {
            return null;
        }
        return convertBase(typeDto);
    }

    Type convertBase(final TypeDto typeDto);

    default TypeDto convert(final Type type) {
        if (type == null) {
            return null;
        }
        return convertBase(type);
    }

    TypeDto convertBase(final Type type);
}
