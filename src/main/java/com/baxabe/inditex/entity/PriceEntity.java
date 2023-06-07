package com.baxabe.inditex.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface PriceEntity extends BaseEntity {

    Long getBrandId();

    LocalDateTime getStartDate();

    LocalDateTime getEndDate();

    Long getPriceListId();

    Long getProductId();

    Integer getPriority();

    BigDecimal getPrice();

    String getCurrency();

}
