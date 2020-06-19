package com.labinvent.cherkasov.api.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Builder
public class TypeDto implements Serializable {
    private Long id;
    private String name;
}
