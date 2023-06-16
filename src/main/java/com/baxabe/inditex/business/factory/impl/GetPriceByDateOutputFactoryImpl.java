package com.baxabe.inditex.business.factory.impl;

import com.baxabe.inditex.business.factory.GetPriceByDateOutputFactory;
import com.baxabe.inditex.controller.price.model.GetPriceByDateOutput;
import com.baxabe.inditex.controller.price.model.impl.GetPriceByDateOutputImpl;
import com.baxabe.inditex.entity.PriceRoEntity;

public class GetPriceByDateOutputFactoryImpl implements GetPriceByDateOutputFactory {

    public GetPriceByDateOutput buildEmptyPriceOutput() {
        return new GetPriceByDateOutputImpl();
    }


    public GetPriceByDateOutput buildPriceOutput(PriceRoEntity priceRoEntity) {
        GetPriceByDateOutput output = new GetPriceByDateOutputImpl();
        output.setProductId(priceRoEntity.getProductId());
        output.setBrandId(priceRoEntity.getBrandId());
        output.setPriceListId(priceRoEntity.getPriceListId());
        output.setStartDate(priceRoEntity.getStartDate());
        output.setEndDate(priceRoEntity.getEndDate());
        output.setPrice(priceRoEntity.getPrice());
        return output;
    }

}
