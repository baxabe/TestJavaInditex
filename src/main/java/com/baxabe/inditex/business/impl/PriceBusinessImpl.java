package com.baxabe.inditex.business.impl;

import com.baxabe.inditex.business.factory.GetPriceByDateOutputFactory;
import com.baxabe.inditex.controller.price.model.GetPriceByDateOutput;
import com.baxabe.inditex.entity.PriceRoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PriceBusinessImpl {

    private final GetPriceByDateOutputFactory factory;

    @Autowired
    PriceBusinessImpl(GetPriceByDateOutputFactory factory) {
        this.factory = factory;
    }

    public GetPriceByDateOutput getPriceFromCandidatesList(List<PriceRoEntity> candidates) {
        GetPriceByDateOutput result;
        if (candidates.size() == 1) {
            result = factory.buildPriceOutput(candidates.get(0));
        } else {
            result = factory.buildEmptyPriceOutput();
        }
        return result;
    }

}
