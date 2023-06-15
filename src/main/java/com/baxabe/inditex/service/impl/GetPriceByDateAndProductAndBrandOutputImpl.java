package com.baxabe.inditex.service.impl;

import com.baxabe.inditex.service.GetPriceByDateAndProductAndBrandOutput;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GetPriceByDateAndProductAndBrandOutputImpl implements GetPriceByDateAndProductAndBrandOutput {

    private Long productId;
    private Long brandId;
    private Long priceListId;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private BigDecimal price;

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

    @JsonProperty("priceListId")
    public Long getPriceListId() {
        return priceListId;
    }

    @JsonProperty("priceList")
    public void setPriceListId(Long priceListId) {
        this.priceListId = priceListId;
    }

    @JsonProperty("startDate")
    @JsonFormat(
            shape = JsonFormat.Shape.STRING,
            pattern = "yyyy-MM-dd-hh.mm.ss")
    public LocalDateTime getStartDate() {
        return startDate;
    }

    @JsonProperty("startDate")
    @JsonFormat(
            shape = JsonFormat.Shape.STRING,
            pattern = "yyyy-MM-dd-hh.mm.ss")
    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    @JsonProperty("endDate")
    @JsonFormat(
            shape = JsonFormat.Shape.STRING,
            pattern = "yyyy-MM-dd-hh.mm.ss")
    public LocalDateTime getEndDate() {
        return endDate;
    }

    @JsonProperty("endDate")
    @JsonFormat(
            shape = JsonFormat.Shape.STRING,
            pattern = "yyyy-MM-dd-hh.mm.ss")
    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    @JsonProperty("price")
    public BigDecimal getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

}
