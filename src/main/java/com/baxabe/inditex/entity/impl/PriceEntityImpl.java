package com.baxabe.inditex.entity.impl;

import com.baxabe.inditex.entity.BrandEntity;
import com.baxabe.inditex.entity.PriceEntity;
import jakarta.persistence.*;
import org.springframework.lang.NonNull;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "PRICES")
public class PriceEntityImpl extends BaseEntityImpl implements PriceEntity {

    @NonNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BRAND_ID", nullable = false)
    protected BrandEntityImpl brand;

    @NonNull
    @Column(name = "START_DATE", nullable = false)
    protected Date startDate;

    @NonNull
    @Column(name = "END_DATE", nullable = false)
    protected Date endDate;

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

    @NonNull
    public BrandEntity getBrand() {
        return (BrandEntity) brand;
    }

    public void setBrand(@NonNull BrandEntity brand) {
        this.brand = (BrandEntityImpl) brand;
    }

    @NonNull
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(@NonNull Date startDate) {
        this.startDate = startDate;
    }

    @NonNull
    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(@NonNull Date endDate) {
        this.endDate = endDate;
    }

    @NonNull
    public Long getPriceListId() {
        return priceListId;
    }

    public void setPriceListId(@NonNull Long priceListId) {
        this.priceListId = priceListId;
    }

    @NonNull
    public Long getProductId() {
        return productId;
    }

    public void setProductId(@NonNull Long productId) {
        this.productId = productId;
    }

    @NonNull
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(@NonNull Integer priority) {
        this.priority = priority;
    }

    @NonNull
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(@NonNull BigDecimal price) {
        this.price = price;
    }

    @NonNull
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(@NonNull String currency) {
        this.currency = currency;
    }

}
