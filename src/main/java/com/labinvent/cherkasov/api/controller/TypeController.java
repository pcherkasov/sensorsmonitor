package com.labinvent.cherkasov.api.controller;

import com.labinvent.cherkasov.api.dto.TypeDto;
import com.labinvent.cherkasov.api.facade.TypeFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/type")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class TypeController {

    private final TypeFacade facade;

    @GetMapping()
    public List<TypeDto> findAll() {
        return facade.findAll();
    }
}
