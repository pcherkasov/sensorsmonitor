package com.labinvent.cherkasov.api.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UnitDto {
    private long id;
    private String name;
}
