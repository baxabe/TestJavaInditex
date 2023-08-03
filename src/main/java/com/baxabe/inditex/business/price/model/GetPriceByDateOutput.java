package com.baxabe.inditex.business.price.model;

import com.baxabe.inditex.business.model.BaseModel;

import java.math.BigDecimal;
import java.util.Date;

public interface GetPriceByDateOutput extends BaseModel {

    Long getProductId();

    void setProductId(Long productId);

    String getProductName();

    void setProductName(String productName);

    Long getBrandId();

    void setBrandId(Long brandId);

    String getBrandName();

    void setBrandName(String brandName);

    Long getPriceListId();

    void setPriceListId(Long priceListId);

    String getPriceListName();

    void setPriceListName(String priceListName);

    Long getPriceId();

    void setPriceId(Long priceId);

    BigDecimal getPrice();

    void setPrice(BigDecimal price);

    Date getStartDate();

    void setStartDate(Date startDate);

    Date getEndDate();

    void setEndDate(Date endDate);

}
