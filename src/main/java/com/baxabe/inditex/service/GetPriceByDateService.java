package com.baxabe.inditex.service;

import com.baxabe.inditex.business.price.model.GetPriceByDateOutput;

public interface GetPriceByDateService {

    GetPriceByDateOutput getPriceByDate(String jsonString);

}
