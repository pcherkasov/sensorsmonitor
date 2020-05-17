package com.labinvent.cherkasov.api.controller;

import com.labinvent.cherkasov.api.dto.UnitDto;
import com.labinvent.cherkasov.api.facade.UnitFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/unit")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class UnitController {

    private final UnitFacade facade;

    @GetMapping()
    public List<UnitDto> findAll() {
        return facade.findAll();
    }
}
