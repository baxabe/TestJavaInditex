package com.baxabe.inditex.business.price.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface GetPriceByDateOutput {

    Long getProductId();

    void setProductId(Long productId);

    Long getBrandId();

    void setBrandId(Long brandId);

    Long getPriceListId();

    void setPriceListId(Long priceListId);

    LocalDateTime getStartDate();

    void setStartDate(LocalDateTime startDate);

    LocalDateTime getEndDate();

    void setEndDate(LocalDateTime endDate);

    BigDecimal getPrice();

    void setPrice(BigDecimal price);

    boolean isEmpty();

    void setEmpty();

    boolean isError();

    void setError(String msg);

    String getError();

}
