package com.baxabe.inditex.business.price.factory;

import com.baxabe.inditex.business.price.model.GetPriceByDateOutput;
import com.baxabe.inditex.entity.PriceRoEntity;
import org.springframework.stereotype.Component;

@Component
public interface GetPriceByDateOutputFactory {

    GetPriceByDateOutput buildEmptyPriceOutput();

    GetPriceByDateOutput buildErrorPriceOutput(String err);

    GetPriceByDateOutput buildPriceOutput(PriceRoEntity priceRoEntity);

}
