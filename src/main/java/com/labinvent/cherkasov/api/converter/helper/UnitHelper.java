package com.labinvent.cherkasov.api.converter.helper;


import com.labinvent.cherkasov.core.model.Unit;
import com.labinvent.cherkasov.core.repository.UnitRepository;
import com.labinvent.cherkasov.core.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;

public class UnitHelper {

    @Autowired
    UnitService unitService;

    public Unit getUnitByName(String name) {
        return unitService
                .findByName(name);
    }
}
