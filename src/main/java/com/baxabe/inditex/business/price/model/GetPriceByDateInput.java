package com.baxabe.inditex.business.price.model;

import java.time.LocalDateTime;

public interface GetPriceByDateInput {

    LocalDateTime getDate();

    void setDate(LocalDateTime date);

    Long getProductId();

    void setProductId(Long productId);

    Long getBrandId();

    void setBrandId(Long brandId);

}
