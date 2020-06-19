package com.labinvent.cherkasov.core.service;

import com.labinvent.cherkasov.core.model.Type;

import java.util.List;

public interface TypeService {
    List<Type> findAll();
    Type findByName(String name);
}
