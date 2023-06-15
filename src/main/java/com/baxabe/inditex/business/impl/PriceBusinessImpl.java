package com.baxabe.inditex.business.impl;

import com.baxabe.inditex.business.factory.GetPriceByDateAndProductAndBrandOutputFactory;
import com.baxabe.inditex.entity.PriceRoEntity;
import com.baxabe.inditex.service.GetPriceByDateAndProductAndBrandOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PriceBusinessImpl {

    private final GetPriceByDateAndProductAndBrandOutputFactory factory;

    @Autowired
    PriceBusinessImpl(GetPriceByDateAndProductAndBrandOutputFactory factory) {
        this.factory = factory;
    }

    public GetPriceByDateAndProductAndBrandOutput getPriceFromCandidatesList(List<PriceRoEntity> candidates) {
        GetPriceByDateAndProductAndBrandOutput result;
        if (candidates.size() == 1) {
            result = factory.buildPriceOutput(candidates.get(0));
        } else {
            result = factory.buildEmptyPriceOutput();
        }
        return result;
    }

}
