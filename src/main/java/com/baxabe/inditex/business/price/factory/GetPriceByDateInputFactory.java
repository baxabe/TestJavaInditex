package com.baxabe.inditex.business.price.factory;

import com.baxabe.inditex.business.price.model.GetPriceByDateInput;

public interface GetPriceByDateInputFactory {

    GetPriceByDateInput buildErrorPriceInput(String err);

    GetPriceByDateInput buildGetPriceByDateInputFromJsonString(String jsonString);

}
