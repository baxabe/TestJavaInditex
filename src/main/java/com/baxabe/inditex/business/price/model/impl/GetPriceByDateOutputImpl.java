package com.baxabe.inditex.business.price.model.impl;

import com.baxabe.inditex.business.model.impl.BaseModelImpl;
import com.baxabe.inditex.business.price.model.GetPriceByDateOutput;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Date;

public class GetPriceByDateOutputImpl extends BaseModelImpl implements GetPriceByDateOutput {

    @JsonProperty("brandId")
    private Long brandId;
    @JsonProperty("priceListId")
    private Long priceListId;
    @JsonProperty("productId")
    private Long productId;
    @JsonProperty("price")
    private BigDecimal price;
    @JsonProperty("startDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = INDITEX_DATE_PATTERN, timezone = INDITEX_DATE_TIMEZONE)
    private Date startDate;
    @JsonProperty("endDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = INDITEX_DATE_PATTERN, timezone = INDITEX_DATE_TIMEZONE)
    private Date endDate;
    @JsonProperty("brandName")
    private String brandName;
    @JsonProperty("priceListName")
    private String priceListName;
    @JsonProperty("productName")
    private String productName;

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public Long getPriceListId() {
        return priceListId;
    }

    public void setPriceListId(Long priceListId) {
        this.priceListId = priceListId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getPriceListName() {
        return priceListName;
    }

    public void setPriceListName(String priceListName) {
        this.priceListName = priceListName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    protected boolean checkHasAllData() {
        return getProductId() != null &&
                !getProductName().isEmpty() &&
                getBrandId() != null &&
                !getBrandName().isEmpty() &&
                getPriceListId() != null &&
                !getPriceListName().isEmpty() &&
                getStartDate() != null &&
                getEndDate() != null &&
                getPrice() != null;
    }

}
