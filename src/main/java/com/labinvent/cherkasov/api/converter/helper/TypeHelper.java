package com.labinvent.cherkasov.api.converter.helper;

import com.labinvent.cherkasov.core.model.Type;
import com.labinvent.cherkasov.core.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;


public class TypeHelper {

    @Autowired
    TypeService typeService;

    public Type getTypeByName(String name) {
        return typeService
                .findByName(name);
    }
}
