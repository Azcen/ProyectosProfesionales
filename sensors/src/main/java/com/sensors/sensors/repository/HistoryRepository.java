package com.sensors.sensors.repository;

import com.sensors.sensors.model.History;
import com.sensors.sensors.model.Sensor;
import org.springframework.data.repository.CrudRepository;

public interface HistoryRepository extends CrudRepository<History,Integer> {
    Iterable<History> getAllBySensor(Sensor sensor);
}
