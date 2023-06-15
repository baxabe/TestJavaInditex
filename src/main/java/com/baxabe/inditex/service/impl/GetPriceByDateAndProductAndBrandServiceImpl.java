package com.baxabe.inditex.service.impl;

import com.baxabe.inditex.business.PriceBusiness;
import com.baxabe.inditex.entity.PriceRoEntity;
import com.baxabe.inditex.repository.PriceReadOnlyRepository;
import com.baxabe.inditex.service.GetPriceByDateAndProductAndBrandInput;
import com.baxabe.inditex.service.GetPriceByDateAndProductAndBrandOutput;
import com.baxabe.inditex.service.GetPriceByDateAndProductAndBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetPriceByDateAndProductAndBrandServiceImpl implements GetPriceByDateAndProductAndBrandService {

    private final PriceReadOnlyRepository repository;
    private final PriceBusiness priceBusiness;

    @Autowired
    public GetPriceByDateAndProductAndBrandServiceImpl(
            PriceReadOnlyRepository repository,
            PriceBusiness priceBusiness) {
        this.repository = repository;
        this.priceBusiness = priceBusiness;
    }

    public GetPriceByDateAndProductAndBrandOutput getPriceByDateAndProductAndBrand(GetPriceByDateAndProductAndBrandInput input) {
        List<PriceRoEntity> candidates = repository.findByStartDateIsBeforeAndEndDateIsAfterAndProductIdAndBrandIdOrderByPriorityDesc(
                input.getDate(), input.getDate(), input.getProductId(), input.getBrandId()
        );
        return priceBusiness.getPriceFromCandidatesList(candidates);
    }

}
