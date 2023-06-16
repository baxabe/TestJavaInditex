package com.baxabe.inditex.business.price.model.impl;

import com.baxabe.inditex.business.price.model.GetPriceByDateOutput;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GetPriceByDateOutputImpl implements GetPriceByDateOutput {

    private Long productId;
    private Long brandId;
    private Long priceListId;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private BigDecimal price;
    private boolean isEmpty;
    private boolean error;
    private String errorMsg;

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

    @JsonProperty("priceListId")
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

    @JsonProperty("empty")
    public boolean isEmpty() {
        return isEmpty;
    }

    @JsonProperty("empty")
    public void setEmpty() {
        isEmpty = true;
    }

    @JsonProperty("error")
    public boolean isError() {
        return error;
    }

    @JsonProperty("error")
    public void setError(String msg) {
        error = true;
        errorMsg = msg;
    }

    @JsonProperty("error")
    public String getError() {
        return errorMsg;
    }

}
