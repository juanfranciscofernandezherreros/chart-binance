package com.fernandez.chartreactive.service;

import com.fernandez.chartreactive.entity.Ticker;
import com.fernandez.chartreactive.repository.TickerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TickerServiceImpl implements TickerService{

    private final TickerRepository tickerRepository;

    public TickerServiceImpl(TickerRepository tickerRepository) {
        this.tickerRepository = tickerRepository;
    }

    @Override
    public List<Ticker> getAll(Query query) {
        return tickerRepository.findAll(query);
    }

    @Override
    public Page<Ticker> getPage(Query query, Pageable pageable) {
        return tickerRepository.findAll(query, pageable);
    }

}
