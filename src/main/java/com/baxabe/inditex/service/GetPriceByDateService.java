package com.baxabe.inditex.service;

import com.baxabe.inditex.controller.price.model.GetPriceByDateInput;
import com.baxabe.inditex.controller.price.model.GetPriceByDateOutput;

public interface GetPriceByDateService {

    GetPriceByDateOutput getPriceByDateAndProductAndBrand(GetPriceByDateInput input);

}
