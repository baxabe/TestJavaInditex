package com.baxabe.inditex.controller.factory.impl;

import com.baxabe.inditex.controller.factory.HttpHeaderFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HttpHeaderFactoryImpl implements HttpHeaderFactory {

    @Override
    public String getHttpParam(HttpHeaders httpHeaders, String paramTag) {
        List<String> listParam = httpHeaders.getOrEmpty(paramTag);
        if (!listParam.isEmpty()) {
            return listParam.get(0);
        }
        return "";
    }
}
