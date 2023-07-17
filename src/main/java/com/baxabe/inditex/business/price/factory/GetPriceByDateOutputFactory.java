package com.baxabe.inditex.business.price.factory;

import com.baxabe.inditex.business.price.model.GetPriceByDateOutput;
import com.baxabe.inditex.entity.PriceByDateView;

public interface GetPriceByDateOutputFactory {

    GetPriceByDateOutput buildEmptyPriceOutput();

    GetPriceByDateOutput buildErrorPriceOutput(String err);

    GetPriceByDateOutput buildPriceOutput(PriceByDateView priceEntity);

}
