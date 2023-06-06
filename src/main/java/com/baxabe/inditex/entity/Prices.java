package com.baxabe.inditex.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface Prices {

    Integer getId();

    Integer getBrandId();

    LocalDateTime getStartDate();

    LocalDateTime getEndDate();

    Integer getPriceList();

    Integer getProductId();

    Integer getPriority();

    BigDecimal getPrice();

    String getCurrency();

}
