package com.labinvent.cherkasov.api.controller;

import com.labinvent.cherkasov.core.model.Unit;
import com.labinvent.cherkasov.core.service.UnitService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/unit")
@RequiredArgsConstructor
public class UnitController {

    UnitService service;

    @GetMapping()
    public List<Unit> findAll() {
        return service.findAll();
    }
}
