package com.baxabe.inditex.controller.factory;

import org.springframework.http.HttpHeaders;

public interface HttpHeaderFactory {

    String getHttpParam(HttpHeaders httpHeaders, String paramTag);

}
