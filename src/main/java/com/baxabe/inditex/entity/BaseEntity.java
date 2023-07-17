package com.baxabe.inditex.entity;

import org.springframework.lang.NonNull;

import java.util.Date;


public interface BaseEntity {

    @NonNull
    Long getId();

    void setId(@NonNull Long id);

    // This is never used in project. Provided as example.
    @NonNull
    Date getCreatedAt();

    // This is never used in project. Provided as example.
    void setCreatedAt(@NonNull Date ldt);

    // This is never used in project. Provided as example.
    @NonNull
    Date getUpdatedAt();

    // This is never used in project. Provided as example.
    void setUpdatedAt(@NonNull Date ldt);

    // This is never used in project. Provided as example.
    @NonNull
    Date getDeletedAt();

    // This is never used in project. Provided as example.
    void setDeletedAt(@NonNull Date ldt);

    // This is never used in project. Provided as example.
    @NonNull
    Boolean isDeleted();

}
