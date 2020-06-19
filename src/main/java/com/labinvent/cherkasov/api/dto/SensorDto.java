package com.labinvent.cherkasov.api.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@Builder
@EqualsAndHashCode
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class SensorDto implements Serializable {
    private long id;
    private String name;
    private String model;
    private int rangeFrom;
    private int rangeTo;
    private String type;
    private String unit;
    private String location;
    private String description;

}
