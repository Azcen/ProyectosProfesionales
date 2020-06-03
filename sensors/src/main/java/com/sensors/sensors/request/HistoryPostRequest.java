package com.sensors.sensors.request;

import com.sensors.sensors.model.History;
import com.sensors.sensors.model.Sensor;

import java.util.Date;

public class HistoryPostRequest {

    private Double value;
    private Integer sensorId;

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Integer getSensorId() {
        return sensorId;
    }

    public void setSensorId(Integer sensorId) {
        this.sensorId = sensorId;
    }
}
