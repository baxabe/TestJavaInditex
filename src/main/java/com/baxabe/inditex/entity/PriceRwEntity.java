package com.baxabe.inditex.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface PriceRwEntity extends BaseRoEntity {

    Long getBrandId();

    void setBrandId(Long brandId);

    LocalDateTime getStartDate();

    void setStartDate(LocalDateTime ldt);

    LocalDateTime getEndDate();

    void setEndDate(LocalDateTime ldt);

    Long getPriceListId();

    void setPriceListId(Long id);

    Long getProductId();

    void setProductId(Long id);

    Integer getPriority();

    void setPriority(Integer priority);

    BigDecimal getPrice();

    void setPrice(BigDecimal price);

    String getCurrency();

    void setCurrency(String currency);

}
