package com.fernandez.chartreactive.repository;

import com.fernandez.chartreactive.entity.Ticker;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface TickerRepository extends ResourceRepository<Ticker,Long> {

}
