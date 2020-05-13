package com.labinvent.cherkasov.api.controller;

import com.labinvent.cherkasov.api.dto.SensorDto;
import com.labinvent.cherkasov.api.facade.SensorFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/sensor")
@RequiredArgsConstructor
public class SensorController {

    private final SensorFacade sensorFacade;

    @GetMapping()
    public List<SensorDto> findAll(){
        return sensorFacade.findAll();
    }

    @GetMapping("/{id}")
    public SensorDto findById(@PathVariable long id){
        return sensorFacade.findById(id);
    }

    @PostMapping()
    public SensorDto createSensor(@RequestBody SensorDto sensorDto) {
        return sensorFacade.saveSensor(sensorDto);
    }

    @PutMapping("/{id}")
    public SensorDto updateSensor(@RequestBody SensorDto sensorDto) {
        return sensorFacade.saveSensor(sensorDto);
    }

}
