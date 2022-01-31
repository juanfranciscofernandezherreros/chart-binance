package com.fernandez.chartreactive.service;

import com.fernandez.chartreactive.entity.TickerDTO;
import com.fernandez.chartreactive.repository.TickerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class TickerServiceImpl implements TickerService{

    private final TickerRepository tickerRepository;

    @Override
    public Flux<TickerDTO> findAll() {
        Flux<TickerDTO> tickerDTOList = tickerRepository.findAllBySymbol("ADAUSDT");
        return  tickerDTOList;
    }

}
