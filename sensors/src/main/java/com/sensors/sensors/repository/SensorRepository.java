package com.sensors.sensors.repository;

import com.sensors.sensors.model.Sensor;
import org.springframework.data.repository.CrudRepository;

public interface SensorRepository extends CrudRepository<Sensor, Integer> {
}
