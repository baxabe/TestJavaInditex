package com.baxabe.inditex.entity;

import org.springframework.lang.NonNull;

import java.math.BigDecimal;
import java.util.Date;

public interface PriceEntity extends BaseEntity {

    // This is never used in project. Provided as example.
    @NonNull
    BrandEntity getBrand();

    // This is never used in project. Provided as example.
    void setBrand(@NonNull BrandEntity brand);

    // This is never used in project. Provided as example.
    @NonNull
    Date getStartDate();

    // This is never used in project. Provided as example.
    void setStartDate(@NonNull Date startDate);

    // This is never used in project. Provided as example.
    @NonNull
    Date getEndDate();

    // This is never used in project. Provided as example.
    void setEndDate(@NonNull Date endDate);

    // This is never used in project. Provided as example.
    @NonNull
    PriceListEntity getPriceList();

    // This is never used in project. Provided as example.
    void setPriceList(@NonNull PriceListEntity priceList);

    @NonNull
    ProductEntity getProduct();

    // This is never used in project. Provided as example.
    void setProduct(@NonNull ProductEntity product);

    // This is never used in project. Provided as example.
    @NonNull
    Integer getPriority();

    // This is never used in project. Provided as example.
    void setPriority(@NonNull Integer priority);

    @NonNull
    BigDecimal getPrice();

    void setPrice(@NonNull BigDecimal price);

    // This is never used in project. Provided as example.
    @NonNull
    String getCurrency();

    // This is never used in project. Provided as example.
    void setCurrency(@NonNull String currency);

}
