package com.baxabe.inditex.business.model;

public interface BaseModel {

    boolean hasAllData();

    boolean isError();

    void setError(String msg);

    String getErrorMsg();

}
