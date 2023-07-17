package com.baxabe.inditex.entity.impl;

import com.baxabe.inditex.entity.PriceByDateView;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.hibernate.annotations.Immutable;
import org.springframework.lang.NonNull;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Immutable
@Table(name = "PRICES_BY_DATE")
public class PriceByDateViewImpl extends BaseViewImpl implements PriceByDateView {

    @NonNull
    @Column(name = "BRAND_ID", insertable = false, updatable = false)
    protected Long brandId;

    @NonNull
    @Column(name = "PRICE_LIST_ID", nullable = false)
    protected Long priceListId;

    @NonNull
    @Column(name = "PRODUCT_ID", nullable = false)
    protected Long productId;

    @NonNull
    @Column(name = "PRICE", nullable = false)
    protected BigDecimal price;

    @NonNull
    @Column(name = "START_DATE", nullable = false)
    protected Date startDate;

    @NonNull
    @Column(name = "END_DATE", nullable = false)
    protected Date endDate;

    @NonNull
    @Column(name = "BRAND_NAME", nullable = false)
    protected String brandName;

    @NonNull
    @Column(name = "PRICE_LIST_NAME", nullable = false)
    protected String priceListName;

    @NonNull
    @Column(name = "PRODUCT_NAME", nullable = false)
    protected String productName;

    @NonNull
    public Long getBrandId() {
        return id;
    }

    @NonNull
    public Long getPriceListId() {
        return priceListId;
    }

    @NonNull
    public Long getProductId() {
        return productId;
    }

    @NonNull
    public BigDecimal getPrice() {
        return price;
    }

    @NonNull
    public Date getStartDate() {
        return startDate;
    }

    @NonNull
    public Date getEndDate() {
        return endDate;
    }

    @NonNull
    public String getBrandName() {
        return brandName;
    }

    @NonNull
    public String getPriceListName() {
        return priceListName;
    }

    @NonNull
    public String getProductName() {
        return productName;
    }

}
