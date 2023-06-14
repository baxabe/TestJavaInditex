package com.baxabe.inditex.service.impl;

import com.baxabe.inditex.business.PriceBusiness;
import com.baxabe.inditex.entity.PriceRoEntity;
import com.baxabe.inditex.repository.PriceReadOnlyRepository;
import com.baxabe.inditex.service.GetPriceByDataRangeAndProductAndBrandInput;
import com.baxabe.inditex.service.GetPriceByDataRangeAndProductAndBrandOutput;
import com.baxabe.inditex.service.GetPriceByDataRangeAndProductAndBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetPriceByDataRangeAndProductAndBrandServiceImpl implements GetPriceByDataRangeAndProductAndBrandService {

    private final PriceReadOnlyRepository repository;
    private final PriceBusiness priceBusiness;

    @Autowired
    public GetPriceByDataRangeAndProductAndBrandServiceImpl(
            PriceReadOnlyRepository repository,
            PriceBusiness priceBusiness) {
        this.repository = repository;
        this.priceBusiness = priceBusiness;
    }

    public GetPriceByDataRangeAndProductAndBrandOutput getPriceByDataRangeAndProductAndBrand(GetPriceByDataRangeAndProductAndBrandInput input) {
        List<PriceRoEntity> candidates = repository.findByStartDateIsBeforeAndEndDateIsAfterAndProductIdAndBrandIdOrderByPriorityDesc(
                input.getDate(), input.getDate(), input.getProductId(), input.getBrandId()
        );
        return priceBusiness.getPriceFromCandidatesList(candidates);
    }

}
