package com.fernandez.chartreactive.controller;

import com.fernandez.chartreactive.entity.TickerDTO;
import com.fernandez.chartreactive.service.TickerService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Flux;

@ExtendWith(SpringExtension.class)
@WebFluxTest(controllers = TickerController.class)
@Import(TickerService.class)
class TickerControllerTest {

    @MockBean
    TickerService service;

    @Autowired
    private WebTestClient client;

    @Test
    void getIsDataReady() {
        Mockito.when(service.findAll("ADAUSDT")).thenReturn(Flux.just(new TickerDTO(), new TickerDTO()));
        client.get()
                .uri("/?symbol=ADAUSDT")
                .accept(MediaType.valueOf(MediaType.TEXT_EVENT_STREAM_VALUE))
                .exchange()
                .expectStatus().isOk();
    }
}