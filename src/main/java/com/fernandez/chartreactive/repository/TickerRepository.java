package com.fernandez.chartreactive.repository;

import com.fernandez.chartreactive.entity.TickerDTO;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface TickerRepository extends ReactiveMongoRepository<TickerDTO,Long> {

    Flux<TickerDTO> findAllBySymbol(String symbol);

}
