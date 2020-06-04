package com.labinvent.cherkasov.core.service.impl;

import com.labinvent.cherkasov.core.exception.ResourceNotFoundException;
import com.labinvent.cherkasov.core.model.Unit;
import com.labinvent.cherkasov.core.repository.UnitRepository;
import com.labinvent.cherkasov.core.service.UnitService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UnitServiceImpl implements UnitService {

    private final UnitRepository repository;

    @Override
    public Unit findByName(String name) {
        return repository
                .findByName(name)
                .orElseThrow(() -> new ResourceNotFoundException("Unit", "name", name));
    }

    @Override
    public List<Unit> findAll() {
        return repository.findAll();
    }
}
