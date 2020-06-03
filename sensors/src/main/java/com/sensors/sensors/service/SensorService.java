package com.sensors.sensors.service;

import com.sensors.sensors.model.Sensor;
import com.sensors.sensors.repository.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SensorService implements ISensorService {

    @Autowired
    SensorRepository repository;

    @Override
    public Iterable <Sensor> getAll(){
        return repository.findAll();
    }

    @Override
    public Sensor create(Sensor sensor) {
        return repository.save(sensor);
    }

    @Override
    public Sensor getOne(Integer id) throws Exception {
        return repository.findById(id).orElseThrow(() -> new Exception("Not found"));
    }


}
