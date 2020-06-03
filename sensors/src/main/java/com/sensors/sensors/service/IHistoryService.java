package com.sensors.sensors.service;

import com.sensors.sensors.model.History;

public interface IHistoryService {
    Iterable<History> getAll(Integer id) throws Exception;
    History create(History history);
}

