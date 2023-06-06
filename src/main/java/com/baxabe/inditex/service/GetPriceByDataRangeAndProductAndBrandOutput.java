package com.baxabe.inditex.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface GetPriceByDataRangeAndProductAndBrandOutput {

    Long getProductId();

    void setProductId(Long productId);

    Long getBrandId();

    Long getPriceList();

    void setPriceList(Long price);

    void setBrandId(Long brandId);

    LocalDateTime getStartDate();

    void setStartDate(LocalDateTime startDate);

    LocalDateTime getEndDate();

    void setEndDate(LocalDateTime endDate);

    BigDecimal getPrice();

    void setPrice(BigDecimal price);

}
