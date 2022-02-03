package com.fernandez.chartreactive.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class LinksDTO {

    private int first;
    private int prev;
    private int currentPage;
    private int last;
    private int next;
}
