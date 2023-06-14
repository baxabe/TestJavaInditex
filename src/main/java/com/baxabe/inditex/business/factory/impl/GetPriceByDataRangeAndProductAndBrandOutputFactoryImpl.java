package com.baxabe.inditex.business.factory.impl;

import com.baxabe.inditex.business.factory.GetPriceByDataRangeAndProductAndBrandOutputFactory;
import com.baxabe.inditex.entity.PriceRoEntity;
import com.baxabe.inditex.service.GetPriceByDataRangeAndProductAndBrandOutput;
import com.baxabe.inditex.service.impl.GetPriceByDataRangeAndProductAndBrandOutputImpl;

public class GetPriceByDataRangeAndProductAndBrandOutputFactoryImpl implements GetPriceByDataRangeAndProductAndBrandOutputFactory {

    public GetPriceByDataRangeAndProductAndBrandOutput buildEmptyPriceFromCandidatesList() {
        return new GetPriceByDataRangeAndProductAndBrandOutputImpl();
    }


    public GetPriceByDataRangeAndProductAndBrandOutput buildPriceFromCandidatesList(PriceRoEntity priceRoEntity) {
        GetPriceByDataRangeAndProductAndBrandOutput output = new GetPriceByDataRangeAndProductAndBrandOutputImpl();
        output.setProductId(priceRoEntity.getProductId());
        output.setBrandId(priceRoEntity.getBrandId());
        output.setPriceList(priceRoEntity.getPriceListId());
        output.setStartDate(priceRoEntity.getStartDate());
        output.setEndDate(priceRoEntity.getEndDate());
        output.setPrice(priceRoEntity.getPrice());
        return output;
    }

}
