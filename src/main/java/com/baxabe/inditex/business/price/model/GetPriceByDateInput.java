package com.baxabe.inditex.business.price.model;

import com.baxabe.inditex.business.model.BaseModel;

import java.util.Date;

public interface GetPriceByDateInput extends BaseModel {

    Date getDate();

    void setDate(Date date);

    Long getProductId();

    // This is never used in project. Provided as example.
    void setProductId(Long productId);

    Long getBrandId();

    // This is never used in project. Provided as example.
    void setBrandId(Long brandId);

}
