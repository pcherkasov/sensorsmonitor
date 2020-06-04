package com.labinvent.cherkasov.core.service.impl;

import com.labinvent.cherkasov.core.exception.ResourceNotFoundException;
import com.labinvent.cherkasov.core.model.Type;
import com.labinvent.cherkasov.core.repository.TypeRepository;
import com.labinvent.cherkasov.core.service.TypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TypeServiceImpl implements TypeService {

    private final TypeRepository repository;

    @Override
    public List<Type> findAll() {
        return repository.findAll();
    }

    @Override
    public Type findByName(String name) {
        return repository
                .findByName(name)
                .orElseThrow(() -> new ResourceNotFoundException("Type", "name", name));
    }
}
