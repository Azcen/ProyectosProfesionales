package com.sensors.sensors.controller;

import com.sensors.sensors.model.Sensor;
import com.sensors.sensors.service.ISensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("sensors")
public class SensorController {

    @Autowired
    ISensorService service;

    @GetMapping
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable("id") Integer id){
        return ResponseEntity.ok("hole");
    }
    @PostMapping()
    public ResponseEntity<?> addSensor(@RequestBody @Valid Sensor sensor){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(sensor));
    }

}
