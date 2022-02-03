package com.fernandez.chartreactive.entity;

import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Document(collection = "employee")
public class Employee {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    @NonNull
    private Department department;


}
