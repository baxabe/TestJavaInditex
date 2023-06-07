package com.baxabe.inditex.entity;

import java.time.LocalDateTime;

public interface BaseRwEntity {

    Long getId();

    void setId(Long id);

    LocalDateTime getCreatedAt();

    void setCreatedAt(LocalDateTime ldt);

    LocalDateTime getUpdatedAt();

    void setUpdatedAt(LocalDateTime ldt);

    LocalDateTime getDeletedAt();

    void setDeletedAt(LocalDateTime ldt);

    Boolean isDeleted();

}
