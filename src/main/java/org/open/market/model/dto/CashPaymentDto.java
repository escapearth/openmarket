package org.open.market.model.dto;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class CashPaymentDto extends PaymentDto {

    private Long cashPaymentId;

    private String bank;

    private String bankAccount;

    private String name;

}
