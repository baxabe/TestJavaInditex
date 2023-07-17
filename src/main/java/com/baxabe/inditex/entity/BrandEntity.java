package com.baxabe.inditex.entity;

import org.springframework.lang.NonNull;

public interface BrandEntity extends BaseEntity {
    @NonNull
    String getName();

    void setName(@NonNull String name);

}
