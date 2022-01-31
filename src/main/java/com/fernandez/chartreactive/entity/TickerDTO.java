package com.fernandez.chartreactive.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document(collection = "tickers")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TickerDTO {
    @Id
    private String id;

    private String symbol;

    private String priceChange;

    private String priceChangePercent;

    private String weightedAvgPrice;

    private String prevClosePrice;

    private String lastPrice;

    private String lastQty;

    private String bidPrice;

    private String bidQty;

    private String askPrice;

    private String askQty;

    private String openPrice;

    private String highPrice;

    private String lowPrice;

    private String volume;

    private String quoteVolume;

    private Long openTime;

    private Long closeTime;

    private Long firstId;

    private Long lastId;



}

