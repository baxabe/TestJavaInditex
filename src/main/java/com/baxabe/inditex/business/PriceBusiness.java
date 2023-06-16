package com.baxabe.inditex.business;

import com.baxabe.inditex.controller.price.model.GetPriceByDateOutput;
import com.baxabe.inditex.entity.PriceRoEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PriceBusiness {
    public GetPriceByDateOutput getPriceFromCandidatesList(List<PriceRoEntity> candidates);
}
