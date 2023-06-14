package com.baxabe.inditex.business.impl;

import com.baxabe.inditex.business.factory.GetPriceByDataRangeAndProductAndBrandOutputFactory;
import com.baxabe.inditex.entity.PriceRoEntity;
import com.baxabe.inditex.service.GetPriceByDataRangeAndProductAndBrandOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PriceBusinessImpl {

    private final GetPriceByDataRangeAndProductAndBrandOutputFactory factory;

    @Autowired
    PriceBusinessImpl(GetPriceByDataRangeAndProductAndBrandOutputFactory factory) {
        this.factory = factory;
    }

    public GetPriceByDataRangeAndProductAndBrandOutput getPriceFromCandidatesList(List<PriceRoEntity> candidates) {
        GetPriceByDataRangeAndProductAndBrandOutput result;
        if (candidates.size() == 1) {
            result = factory.buildPriceFromCandidatesList(candidates.get(0));
        } else {
            result = factory.buildEmptyPriceFromCandidatesList();
        }
        return result;
    }

}
