package com.fernandez.chartreactive.service;

import com.fernandez.chartreactive.entity.TickerDTO;
import reactor.core.publisher.Flux;

public interface TickerService {

    Flux<TickerDTO> findAll();

}
