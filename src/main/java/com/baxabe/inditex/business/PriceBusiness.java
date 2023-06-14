package com.baxabe.inditex.business;

import com.baxabe.inditex.entity.PriceRoEntity;
import com.baxabe.inditex.service.GetPriceByDataRangeAndProductAndBrandOutput;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PriceBusiness {
    public GetPriceByDataRangeAndProductAndBrandOutput getPriceFromCandidatesList(List<PriceRoEntity> candidates);
}
