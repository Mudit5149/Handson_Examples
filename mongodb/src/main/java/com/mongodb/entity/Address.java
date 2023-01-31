package com.mongodb.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
@Data
@Builder
public class Address {
    @Id
    private String address1;
    private String address2;
    private String city;
}

