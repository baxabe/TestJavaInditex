package com.baxabe.inditex.business.price.factory.impl;

import com.baxabe.inditex.business.price.factory.GetPriceByDateInputFactory;
import com.baxabe.inditex.business.price.model.GetPriceByDateInput;
import com.baxabe.inditex.business.price.model.impl.GetPriceByDateInputImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

@Component
public class GetPriceByDateInputFactoryImpl implements GetPriceByDateInputFactory {

    public GetPriceByDateInput buildErrorPriceInput(String err) {
        GetPriceByDateInput output = new GetPriceByDateInputImpl();
        output.setError(err);
        return output;
    }

    public GetPriceByDateInput buildGetPriceByDateInputFromJsonString(String jsonString) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(jsonString, GetPriceByDateInputImpl.class);
        } catch (Exception e) {
            return buildErrorPriceInput(e.getMessage());
        }
    }

}
