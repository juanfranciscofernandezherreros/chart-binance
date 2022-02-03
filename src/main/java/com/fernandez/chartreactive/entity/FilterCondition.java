package com.fernandez.chartreactive.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * <h2>FilterCondition</h2>
 *
 * @author aek
 * <p>
 * Description: Filter Condition Class
 */
@Setter
@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public class FilterCondition {

    private String field;
    private FilterOperationEnum operator;
    private Object value;

}
