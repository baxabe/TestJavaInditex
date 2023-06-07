package com.baxabe.inditex.entity;

import com.baxabe.inditex.entity.impl.BrandEntityImpl;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface PriceRwEntity extends BaseRwEntity {

    Long getBrandId();

    void setBrandId(Long brandId);

    LocalDateTime getStartDate();

    void setStartDate(LocalDateTime startDate);

    LocalDateTime getEndDate();

    void setEndDate(LocalDateTime endDate);

    Long getPriceListId();

    void setPriceListId(Long priceListId);

    Long getProductId();

    void setProductId(Long productId);

    Integer getPriority();

    void setPriority(Integer priority);

    BigDecimal getPrice();

    void setPrice(BigDecimal price);

    String getCurrency();

    void setCurrency(String currency);

    BrandRoEntity getBrand();

    void setBrand(BrandEntityImpl brand);

}