package com.baxabe.inditex.business.price;

import com.baxabe.inditex.business.price.model.GetPriceByDateOutput;
import com.baxabe.inditex.entity.PriceByDateView;

import java.util.List;

public interface PriceBusiness {
    GetPriceByDateOutput getPriceFromCandidatesList(List<PriceByDateView> candidates);
}
