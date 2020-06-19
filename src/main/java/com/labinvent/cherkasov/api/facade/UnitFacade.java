package com.labinvent.cherkasov.api.facade;

import com.labinvent.cherkasov.api.converter.UnitConverter;
import com.labinvent.cherkasov.api.dto.UnitDto;
import com.labinvent.cherkasov.core.model.Unit;
import com.labinvent.cherkasov.core.service.UnitService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UnitFacade {

    private final UnitService service;
    private final UnitConverter converter;

    public List<UnitDto> findAll() {
        List<Unit> unitsFromDb = service.findAll();
        return unitsFromDb
                .stream()
                .map(converter::convert)
                .collect(Collectors.toList());
    }
}
