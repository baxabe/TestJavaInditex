package com.baxabe.inditex.business.factory;

import com.baxabe.inditex.controller.price.model.GetPriceByDateOutput;
import com.baxabe.inditex.entity.PriceRoEntity;
import org.springframework.stereotype.Component;

@Component
public interface GetPriceByDateOutputFactory {

    GetPriceByDateOutput buildEmptyPriceOutput();

    GetPriceByDateOutput buildPriceOutput(PriceRoEntity priceRoEntity);

}
