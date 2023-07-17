package com.baxabe.inditex.service.impl;

import com.baxabe.inditex.business.price.PriceBusiness;
import com.baxabe.inditex.business.price.factory.GetPriceByDateInputFactory;
import com.baxabe.inditex.business.price.factory.GetPriceByDateOutputFactory;
import com.baxabe.inditex.business.price.model.GetPriceByDateInput;
import com.baxabe.inditex.business.price.model.GetPriceByDateOutput;
import com.baxabe.inditex.entity.PriceByDateView;
import com.baxabe.inditex.repository.PriceByDateReadOnlyRepository;
import com.baxabe.inditex.service.GetPriceByDateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetPriceByDateServiceImpl implements GetPriceByDateService {

    private final GetPriceByDateInputFactory inputFactory;
    private final GetPriceByDateOutputFactory outputFactory;
    private final PriceByDateReadOnlyRepository repository;
    private final PriceBusiness priceBusiness;

    @Autowired
    public GetPriceByDateServiceImpl(
            GetPriceByDateInputFactory inputFactory,
            GetPriceByDateOutputFactory outputFactory,
            PriceByDateReadOnlyRepository repository,
            PriceBusiness priceBusiness) {
        this.inputFactory = inputFactory;
        this.outputFactory = outputFactory;
        this.repository = repository;
        this.priceBusiness = priceBusiness;
    }

    public GetPriceByDateOutput getPriceByDate(String jsonString) {
        if (jsonString.isEmpty()) {
            return outputFactory.buildErrorPriceOutput("Empty parameter");
        }
        GetPriceByDateInput input = inputFactory.buildGetPriceByDateInputFromJsonString(jsonString);
        if (input.isError()) {
            return outputFactory.buildErrorPriceOutput("Error parsing json");
        }
        List<PriceByDateView> candidates = repository.findByDate(
                input.getDate(), input.getProductId(), input.getBrandId()
        );
        return priceBusiness.getPriceFromCandidatesList(candidates);
    }

}
