package com.fernandez.chartreactive.service;

import com.fernandez.chartreactive.entity.Ticker;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

public interface TickerService {

    List<Ticker> getAll(Query query);
    Page<Ticker> getPage(Query query, Pageable pageable);
}
