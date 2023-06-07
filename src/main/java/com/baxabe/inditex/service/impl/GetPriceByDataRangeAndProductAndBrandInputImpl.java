package com.baxabe.inditex.service.impl;

import com.baxabe.inditex.service.GetPriceByDataRangeAndProductAndBrandInput;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public class GetPriceByDataRangeAndProductAndBrandInputImpl implements GetPriceByDataRangeAndProductAndBrandInput {

    private LocalDateTime date;
    private Long productId;
    private Long brandId;

    @JsonProperty("date")
    @JsonFormat(
            shape = JsonFormat.Shape.STRING,
            pattern = "yyyy-MM-dd-hh.mm.ss")
    public LocalDateTime getDate() {
        return date;
    }

    @JsonProperty("date")
    @JsonFormat(
            shape = JsonFormat.Shape.STRING,
            pattern = "yyyy-MM-dd-hh.mm.ss")
    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @JsonProperty("productId")
    public Long getProductId() {
        return productId;
    }

    @JsonProperty("productId")
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @JsonProperty("brandId")
    public Long getBrandId() {
        return brandId;
    }

    @JsonProperty("brandId")
    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

}
