package com.baxabe.inditex.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface GetPriceByDataRangeAndProductAndBrandOutput {

    Long getProductId();

    void setProductId(Long productId);

    Long getBrandId();

    void setBrandId(Long brandId);

    Long getPriceList();

    void setPriceList(Long price);

    LocalDateTime getStartDate();

    void setStartDate(LocalDateTime startDate);

    LocalDateTime getEndDate();

    void setEndDate(LocalDateTime endDate);

    BigDecimal getPrice();

    void setPrice(BigDecimal price);

}
