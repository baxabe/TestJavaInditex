package com.baxabe.inditex.business.price.factory.impl;

import com.baxabe.inditex.business.price.factory.GetPriceByDateOutputFactory;
import com.baxabe.inditex.business.price.model.GetPriceByDateOutput;
import com.baxabe.inditex.business.price.model.impl.GetPriceByDateOutputImpl;
import com.baxabe.inditex.entity.PriceByDateView;
import org.springframework.stereotype.Component;

@Component
public class GetPriceByDateOutputFactoryImpl implements GetPriceByDateOutputFactory {

    public GetPriceByDateOutput buildEmptyPriceOutput() {
        return new GetPriceByDateOutputImpl();
    }

    public GetPriceByDateOutput buildErrorPriceOutput(String err) {
        GetPriceByDateOutput output = new GetPriceByDateOutputImpl();
        output.setError(err);
        return output;
    }

    public GetPriceByDateOutput buildPriceOutput(PriceByDateView priceEntity) {
        GetPriceByDateOutput output = new GetPriceByDateOutputImpl();
        output.setBrandId(priceEntity.getBrandId());
        output.setPriceListId(priceEntity.getPriceListId());
        output.setProductId(priceEntity.getProductId());
        output.setPrice(priceEntity.getPrice());
        output.setStartDate(priceEntity.getStartDate());
        output.setEndDate(priceEntity.getEndDate());
        output.setBrandName(priceEntity.getBrandName());
        output.setPriceListName(priceEntity.getPriceListName());
        output.setProductName(priceEntity.getProductName());
        if (output.hasAllData()) {
            return output;
        } else if (output.isError()) {
            return buildErrorPriceOutput(output.getErrorMsg());
        } else {
            return buildErrorPriceOutput("Can't retrieve data correctly.");
        }
    }

}
