package com.baxabe.inditex.entity;

import java.time.LocalDateTime;

public interface BaseRoEntity {

    Long getId();

    LocalDateTime getCreatedAt();

    LocalDateTime getUpdatedAt();

    LocalDateTime getDeletedAt();

    Boolean isDeleted();

}
