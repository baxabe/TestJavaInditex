package com.baxabe.inditex.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface PriceEntity {

    Long getId();

    Long getBrandId();

    LocalDateTime getStartDate();

    LocalDateTime getEndDate();

    Integer getPriceList();

    Long getProductId();

    Integer getPriority();

    BigDecimal getPrice();

    String getCurrency();

}
