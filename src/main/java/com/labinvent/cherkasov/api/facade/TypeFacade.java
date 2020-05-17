package com.labinvent.cherkasov.api.facade;

import com.labinvent.cherkasov.api.converter.TypeConverter;
import com.labinvent.cherkasov.api.dto.TypeDto;
import com.labinvent.cherkasov.core.model.Type;
import com.labinvent.cherkasov.core.service.TypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TypeFacade {

    private final TypeService service;
    private final TypeConverter converter;

    public List<TypeDto> findAll() {
        List<Type> typesFromDb = service.findAll();
        return typesFromDb
                .stream()
                .map(converter::convert)
                .collect(Collectors.toList());
    }


}
