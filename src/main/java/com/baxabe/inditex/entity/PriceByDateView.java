package com.baxabe.inditex.entity;

import org.springframework.lang.NonNull;

import java.math.BigDecimal;
import java.util.Date;

public interface PriceByDateView extends BaseView {
    @NonNull
    Long getPriceId();

    @NonNull
    Long getBrandId();

    @NonNull
    Long getPriceListId();

    @NonNull
    Long getProductId();

    @NonNull
    BigDecimal getPrice();

    @NonNull
    Date getStartDate();

    @NonNull
    Date getEndDate();

    @NonNull
    String getBrandName();

    @NonNull
    String getPriceListName();

    @NonNull
    String getProductName();

}
