package com.baxabe.inditex.business.price.factory.impl;

import com.baxabe.inditex.business.price.factory.GetPriceByDateOutputFactory;
import com.baxabe.inditex.business.price.model.GetPriceByDateOutput;
import com.baxabe.inditex.business.price.model.impl.GetPriceByDateOutputImpl;
import com.baxabe.inditex.entity.PriceRoEntity;

public class GetPriceByDateOutputFactoryImpl implements GetPriceByDateOutputFactory {

    public GetPriceByDateOutput buildEmptyPriceOutput() {
        GetPriceByDateOutput output = new GetPriceByDateOutputImpl();
        output.setEmpty();
        return output;
    }

    public GetPriceByDateOutput buildErrorPriceOutput(String err) {
        GetPriceByDateOutput output = new GetPriceByDateOutputImpl();
        output.setError(err);
        return output;
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
