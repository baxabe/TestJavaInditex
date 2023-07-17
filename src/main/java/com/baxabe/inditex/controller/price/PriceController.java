package com.baxabe.inditex.controller.price;

import com.baxabe.inditex.business.price.model.GetPriceByDateOutput;
import com.baxabe.inditex.controller.factory.HttpHeaderFactory;
import com.baxabe.inditex.service.GetPriceByDateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/price")
public class PriceController {

    @SuppressWarnings("SpellCheckingInspection")
    private static final String PRICE_BY_DATE_PARAM_TAG = "getpricebydateinput";

    private final GetPriceByDateService getPriceByDateService;
    private final HttpHeaderFactory httpHeaderFactory;

    @Autowired
    public PriceController(GetPriceByDateService getPriceByDateService,
                           HttpHeaderFactory httpHeaderFactory) {
        this.getPriceByDateService = getPriceByDateService;
        this.httpHeaderFactory = httpHeaderFactory;
    }

    @GetMapping("/bydate")
    @ResponseBody
    public GetPriceByDateOutput getPriceByDate(@RequestHeader HttpHeaders httpHeaders) {
        String jsonString = httpHeaderFactory.getHttpParam(httpHeaders, PRICE_BY_DATE_PARAM_TAG);
        return getPriceByDateService.getPriceByDate(jsonString);
    }
}
