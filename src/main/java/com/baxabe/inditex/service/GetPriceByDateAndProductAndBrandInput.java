package com.baxabe.inditex.service;

import java.time.LocalDateTime;

public interface GetPriceByDateAndProductAndBrandInput {

    LocalDateTime getDate();

    void setDate(LocalDateTime date);

    Long getProductId();

    void setProductId(Long productId);

    Long getBrandId();

    void setBrandId(Long brandId);

}
