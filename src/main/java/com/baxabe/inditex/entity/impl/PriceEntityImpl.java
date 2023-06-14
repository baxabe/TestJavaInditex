package com.baxabe.inditex.entity.impl;

import com.baxabe.inditex.entity.BrandRoEntity;
import com.baxabe.inditex.entity.PriceRoEntity;
import com.baxabe.inditex.entity.PriceRwEntity;
import jakarta.persistence.*;
import org.springframework.lang.NonNull;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "PRICES")
public class PriceEntityImpl extends BaseEntityImpl implements PriceRoEntity, PriceRwEntity {

    @NonNull
    @Column(name = "BRAND_ID", nullable = false)
    protected Long brandId;

    @NonNull
    @Column(name = "START_DATE", nullable = false)
    protected LocalDateTime startDate;

    @NonNull
    @Column(name = "END_DATE", nullable = false)
    protected LocalDateTime endDate;

    @NonNull
    @Column(name = "PRICE_LIST_ID", nullable = false)
    protected Long priceListId;

    @NonNull
    @Column(name = "PRODUCT_ID", nullable = false)
    protected Long productId;

    @NonNull
    @Column(name = "PRIORITY", nullable = false)
    protected Integer priority;

    @NonNull
    @Column(name = "PRICE", nullable = false)
    protected BigDecimal price;

    @NonNull
    @Column(name = "CURRENCY", nullable = false)
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
