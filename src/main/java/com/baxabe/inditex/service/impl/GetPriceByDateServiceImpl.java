package com.baxabe.inditex.service.impl;

import com.baxabe.inditex.business.price.PriceBusiness;
import com.baxabe.inditex.business.price.model.GetPriceByDateInput;
import com.baxabe.inditex.business.price.model.GetPriceByDateOutput;
import com.baxabe.inditex.entity.PriceRoEntity;
import com.baxabe.inditex.repository.PriceReadOnlyRepository;
import com.baxabe.inditex.service.GetPriceByDateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetPriceByDateServiceImpl implements GetPriceByDateService {

    private final PriceReadOnlyRepository repository;
    private final PriceBusiness priceBusiness;

    @Autowired
    public GetPriceByDateServiceImpl(
            PriceReadOnlyRepository repository,
            PriceBusiness priceBusiness) {
        this.repository = repository;
        this.priceBusiness = priceBusiness;
    }

    public GetPriceByDateOutput getPriceByDate(GetPriceByDateInput input) {
        List<PriceRoEntity> candidates = repository.findByStartDateIsBeforeAndEndDateIsAfterAndProductIdAndBrandIdOrderByPriorityDesc(
                input.getDate(), input.getDate(), input.getProductId(), input.getBrandId()
        );
        return priceBusiness.getPriceFromCandidatesList(candidates);
    }

}
