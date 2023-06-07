package com.baxabe.inditex.entity.impl;

import com.baxabe.inditex.entity.BrandRoEntity;
import com.baxabe.inditex.entity.PriceRoEntity;
import com.baxabe.inditex.entity.PriceRwEntity;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "PRICES")
public class PriceEntityImpl extends BaseEntityImpl implements PriceRoEntity, PriceRwEntity {

    @Column(name = "BRAND_ID")
    protected Long brandId;

    @Column(name = "START_DATE")
    protected LocalDateTime startDate;

    @Column(name = "END_DATE")
    protected LocalDateTime endDate;

    @Column(name = "PRICE_LIST_ID")
    protected Long priceListId;

    @Column(name = "PRODUCT_ID")
    protected Long productId;

    @Column(name = "PRIORITY")
    protected Integer priority;

    @Column(name = "PRICE")
    protected BigDecimal price;

    @Column(name = "CURRENCY")
    protected String currency;

    @ManyToOne
    @JoinColumn(name = "BRAND_ID")
    protected BrandEntityImpl brand;

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
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

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BrandRoEntity getBrand() {
        return brand;
    }

    public void setBrand(BrandEntityImpl brand) {
        this.brand = brand;
    }

}
