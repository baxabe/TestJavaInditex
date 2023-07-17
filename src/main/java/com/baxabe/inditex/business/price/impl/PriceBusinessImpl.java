package com.baxabe.inditex.business.price.impl;

import com.baxabe.inditex.business.price.PriceBusiness;
import com.baxabe.inditex.business.price.factory.GetPriceByDateOutputFactory;
import com.baxabe.inditex.business.price.model.GetPriceByDateOutput;
import com.baxabe.inditex.entity.PriceByDateView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PriceBusinessImpl implements PriceBusiness {

    private final GetPriceByDateOutputFactory factory;

    @Autowired
    public PriceBusinessImpl(GetPriceByDateOutputFactory factory) {
        this.factory = factory;
    }

    public GetPriceByDateOutput getPriceFromCandidatesList(List<PriceByDateView> candidates) {
        GetPriceByDateOutput result;
        if (!candidates.isEmpty()) {
            result = factory.buildPriceOutput(candidates.get(0));
        } else {
            result = factory.buildEmptyPriceOutput();
        }
        return result;
    }

}
