package com.labinvent.cherkasov.core.service;

import com.labinvent.cherkasov.core.model.Unit;

import java.util.List;

public interface UnitService {
    List<Unit> findAll();
    Unit findByName(String name);
}
