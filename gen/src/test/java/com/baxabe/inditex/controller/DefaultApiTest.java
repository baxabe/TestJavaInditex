/*
 * Java Test
 * API-REST End point to get price by data range
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baxabe.inditex.controller;

import com.baxabe.inditex.ApiException;
import com.baxabe.inditex.controller.model.Error;
import com.baxabe.inditex.controller.model.Price;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for DefaultApi
 */
@Ignore
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    
    /**
     * 
     *
     * Get actual price in a data range
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getByRangeTest() throws ApiException {
        String date = null;
        Long prodId = null;
        Long brandId = null;
        Price response = 
        api.getByRange(date, prodId, brandId);
        
        // TODO: test validations
    }
    
}