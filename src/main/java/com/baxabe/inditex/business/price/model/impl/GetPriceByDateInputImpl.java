package com.baxabe.inditex.business.price.model.impl;

import com.baxabe.inditex.business.model.impl.BaseModelImpl;
import com.baxabe.inditex.business.price.model.GetPriceByDateInput;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class GetPriceByDateInputImpl extends BaseModelImpl implements GetPriceByDateInput {

    public static final String JSON_PROPERTY_DATE_TAG = "date";
    public static final String JSON_PROPERTY_PRODUCT_ID_TAG = "productId";
    public static final String JSON_PROPERTY_BRAND_ID_TAG = "brandId";

    @JsonProperty(JSON_PROPERTY_DATE_TAG)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = INDITEX_DATE_PATTERN, timezone = INDITEX_DATE_TIMEZONE)
    private Date date;

    @JsonProperty(JSON_PROPERTY_PRODUCT_ID_TAG)
    private Long productId;

    @JsonProperty(JSON_PROPERTY_BRAND_ID_TAG)
    private Long brandId;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    @Override
    protected boolean checkHasAllData() {
        return getDate() != null &&
                getProductId() != null &&
                getBrandId() != null;
    }

}
