package com.baxabe.inditex.entity;

import org.springframework.lang.NonNull;

public interface BaseView {

    @NonNull
    Long getId();

    void setId(@NonNull Long id);

}
