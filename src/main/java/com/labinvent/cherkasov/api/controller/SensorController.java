package com.labinvent.cherkasov.api.controller;

import com.labinvent.cherkasov.api.dto.SensorDto;
import com.labinvent.cherkasov.api.facade.SensorFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/sensor")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class SensorController {

    private final SensorFacade sensorFacade;

    @GetMapping()
    public Page<SensorDto> findAll(@PageableDefault(size = 4, sort = {"id"}) Pageable pageable) {
        return sensorFacade.findAll(pageable);
    }

    @GetMapping("/search")
    public Page<SensorDto> findAllBySubquery(
            @RequestParam(value = "q", required = true) String query,
            @PageableDefault(size = 4, sort = {"id"}) Pageable pageable) {
        return sensorFacade.findAll(query, pageable);
    }

    @GetMapping("/{id}")
    public SensorDto findById(@PathVariable long id) {
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

    @DeleteMapping("/{id}")
    public void deleteSensor(@PathVariable long id) {
        sensorFacade.deleteSensor(id);
    }

}
