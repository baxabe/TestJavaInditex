package com.baxabe.inditex.entity.impl;

import com.baxabe.inditex.entity.BaseRoEntity;
import com.baxabe.inditex.entity.BaseRwEntity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.time.LocalDateTime;

@MappedSuperclass
public abstract class BaseEntityImpl implements BaseRoEntity, BaseRwEntity {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    protected Long id;

    @Column(name = "CREATED_AT")
    protected LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    protected LocalDateTime updatedAt;

    @Column(name = "DELETED_AT")
    protected LocalDateTime deletedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime ldt) {
        createdAt = ldt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime ldt) {
        updatedAt = ldt;
    }

    public LocalDateTime getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(LocalDateTime ldt) {
        deletedAt = ldt;
    }

    public Boolean isDeleted() {
        return deletedAt != null;
    }

}
