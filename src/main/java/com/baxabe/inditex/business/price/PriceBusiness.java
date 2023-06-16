package com.baxabe.inditex.business.price;

import com.baxabe.inditex.business.price.model.GetPriceByDateOutput;
import com.baxabe.inditex.entity.PriceRoEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PriceBusiness {
    public GetPriceByDateOutput getPriceFromCandidatesList(List<PriceRoEntity> candidates);
}
