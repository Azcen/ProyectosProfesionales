package com.sensors.sensors.service;

import com.sensors.sensors.model.History;
import com.sensors.sensors.model.Sensor;
import com.sensors.sensors.repository.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistoryService implements IHistoryService{

    @Autowired
    SensorService sensorService;

    @Autowired
    HistoryRepository repository;

    @Override
    public Iterable <History> getAll(Integer id) throws Exception {
        Sensor sensor = sensorService.getOne(id);
        return repository.getAllBySensor(sensor);
    }

    @Override
    public History create(History history) {
        return repository.save(history);
    }

}
