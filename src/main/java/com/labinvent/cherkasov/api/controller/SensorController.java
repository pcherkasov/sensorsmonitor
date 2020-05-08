package com.labinvent.cherkasov.api.controller;

import com.labinvent.cherkasov.api.dto.SensorDto;
import com.labinvent.cherkasov.api.facade.SensorFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/")
@RequiredArgsConstructor
public class SensorController {

    private final SensorFacade sensorFacade;

    @GetMapping(value = "/api/sensor")
    public List<SensorDto> findAll(){
        return new ArrayList<>();
    }

    @GetMapping(value = "/")
    public String test(){
        return "Test string";
    }


}
