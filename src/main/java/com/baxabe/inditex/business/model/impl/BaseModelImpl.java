package com.baxabe.inditex.business.model.impl;

import com.baxabe.inditex.business.model.BaseModel;
import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class BaseModelImpl implements BaseModel {

    protected static final String INDITEX_DATE_PATTERN = "yyyy-MM-dd-HH.mm.ss";
    protected static final String INDITEX_DATE_TIMEZONE = "UTC";

    @JsonProperty("hasAllData")
    private boolean hasAllData;
    @JsonProperty("error")
    private boolean error;
    @JsonProperty("errorMsg")
    private String errorMsg = "";

    public boolean hasAllData() {
        setHasAllData(checkHasAllData());
        return hasAllData;
    }

    public boolean isError() {
        return error;
    }

    public void setError(String msg) {
        error = true;
        errorMsg = msg;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    protected abstract boolean checkHasAllData();

    private void setHasAllData(Boolean hasAllData) {
        this.hasAllData = hasAllData;
    }

}
