package com.baxabe.inditex.business.factory.impl;

import com.baxabe.inditex.business.factory.GetPriceByDateAndProductAndBrandOutputFactory;
import com.baxabe.inditex.entity.PriceRoEntity;
import com.baxabe.inditex.service.GetPriceByDateAndProductAndBrandOutput;
import com.baxabe.inditex.service.impl.GetPriceByDateAndProductAndBrandOutputImpl;

public class GetPriceByDateAndProductAndBrandOutputFactoryImpl implements GetPriceByDateAndProductAndBrandOutputFactory {

    public GetPriceByDateAndProductAndBrandOutput buildEmptyPriceOutput() {
        return new GetPriceByDateAndProductAndBrandOutputImpl();
    }


    public GetPriceByDateAndProductAndBrandOutput buildPriceOutput(PriceRoEntity priceRoEntity) {
        GetPriceByDateAndProductAndBrandOutput output = new GetPriceByDateAndProductAndBrandOutputImpl();
        output.setProductId(priceRoEntity.getProductId());
        output.setBrandId(priceRoEntity.getBrandId());
        output.setPriceListId(priceRoEntity.getPriceListId());
        output.setStartDate(priceRoEntity.getStartDate());
        output.setEndDate(priceRoEntity.getEndDate());
        output.setPrice(priceRoEntity.getPrice());
        return output;
    }

}
