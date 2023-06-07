package com.baxabe.inditex.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface PriceRoEntity extends BaseRoEntity {

    Long getBrandId();

    LocalDateTime getStartDate();

    LocalDateTime getEndDate();

    Long getPriceListId();

    Long getProductId();

    Integer getPriority();

    BigDecimal getPrice();

    String getCurrency();

    BrandRoEntity getBrand();

}
