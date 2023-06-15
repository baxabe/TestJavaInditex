package com.baxabe.inditex.business.factory;

import com.baxabe.inditex.entity.PriceRoEntity;
import com.baxabe.inditex.service.GetPriceByDateAndProductAndBrandOutput;
import org.springframework.stereotype.Component;

@Component
public interface GetPriceByDateAndProductAndBrandOutputFactory {

    GetPriceByDateAndProductAndBrandOutput buildEmptyPriceOutput();

    GetPriceByDateAndProductAndBrandOutput buildPriceOutput(PriceRoEntity priceRoEntity);

}
