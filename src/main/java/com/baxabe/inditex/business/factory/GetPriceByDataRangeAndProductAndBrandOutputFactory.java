package com.baxabe.inditex.business.factory;

import com.baxabe.inditex.entity.PriceRoEntity;
import com.baxabe.inditex.service.GetPriceByDataRangeAndProductAndBrandOutput;
import org.springframework.stereotype.Component;

@Component
public interface GetPriceByDataRangeAndProductAndBrandOutputFactory {

    GetPriceByDataRangeAndProductAndBrandOutput buildEmptyPriceFromCandidatesList();

    GetPriceByDataRangeAndProductAndBrandOutput buildPriceFromCandidatesList(PriceRoEntity priceRoEntity);

}
