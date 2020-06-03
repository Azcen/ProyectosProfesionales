package com.sensors.sensors.service;

import com.sensors.sensors.model.Sensor;

public interface ISensorService {
    Iterable<Sensor> getAll();
    Sensor create(Sensor sensor);
    Sensor getOne(Integer id) throws Exception;
}
