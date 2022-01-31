package com.fernandez.chartreactive.controller;

import com.fernandez.chartreactive.entity.TickerDTO;
import com.fernandez.chartreactive.service.TickerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class TickerController {

    private static final int DELAY_PER_ITEM_MS = 100;

    @Autowired
    private TickerService tickerService;

    @GetMapping(value="/",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    private Flux<TickerDTO> findAll(@RequestParam("symbol") String symbol) {
        return this.tickerService.findAll(symbol);
    }

}
