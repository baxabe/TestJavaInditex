package com.baxabe.inditex.service;

import com.baxabe.inditex.business.price.model.GetPriceByDateInput;
import com.baxabe.inditex.business.price.model.GetPriceByDateOutput;

public interface GetPriceByDateService {

    GetPriceByDateOutput getPriceByDate(GetPriceByDateInput input);

}
