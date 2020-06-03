package com.sensors.sensors.controller;


import com.sensors.sensors.model.History;
import com.sensors.sensors.model.Sensor;
import com.sensors.sensors.request.HistoryPostRequest;
import com.sensors.sensors.service.IHistoryService;
import com.sensors.sensors.service.ISensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping("history")
public class HistoryController {

    @Autowired
    IHistoryService service;

    @Autowired
    ISensorService sensorService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/sensor/{id}")
    public ResponseEntity<?> getAll(@PathVariable("id") Integer id) throws Exception {
        return ResponseEntity.ok(service.getAll(id));
    }

    @GetMapping("/{sensor_id}")
    public ResponseEntity<?> getOne(@PathVariable("sensor_id") Integer id){
        return ResponseEntity.ok("hole");
    }

    @PostMapping()
    public ResponseEntity<?> addSensor(@RequestBody HistoryPostRequest req){
        try {
            Sensor sensor = sensorService.getOne(req.getSensorId());
            History history = new History();
            history.setSensor(sensor);
            history.setValue(req.getValue());
            return ResponseEntity.status(CREATED).body(service.create(history));
        }catch(Exception e){
            Map<String, String> msg = new HashMap<>();
            msg.put("Error","No se encontro ID");
            return ResponseEntity.status(NOT_FOUND).body(msg);
        }
    }
}