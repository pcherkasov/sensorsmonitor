package com.labinvent.cherkasov.api.controller;

import com.labinvent.cherkasov.core.model.Type;
import com.labinvent.cherkasov.core.service.TypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/type")
@RequiredArgsConstructor
public class TypeController {

    TypeService service;

    @GetMapping()
    public List<Type> findAll() {
        return service.findAll();
    }
}
