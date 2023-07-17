package com.baxabe.inditex.entity.impl;

import com.baxabe.inditex.entity.BaseEntity;
import jakarta.persistence.*;
import org.springframework.lang.NonNull;

import java.util.Date;

@MappedSuperclass
public class BaseEntityImpl implements BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, updatable = false)
    protected Long id;

    @Column(name = "CREATED_AT")
    protected Date createdAt;

    @Column(name = "UPDATED_AT")
    protected Date updatedAt;

    @Column(name = "DELETED_AT")
    protected Date deletedAt;

    @NonNull
    public Long getId() {
        return id;
    }

    public void setId(@NonNull Long id) {
        this.id = id;
    }

    @NonNull
    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(@NonNull Date ldt) {
        createdAt = ldt;
    }

    @NonNull
    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(@NonNull Date ldt) {
        updatedAt = ldt;
    }

    @NonNull
    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(@NonNull Date ldt) {
        deletedAt = ldt;
    }

    @NonNull
    public Boolean isDeleted() {
        return deletedAt != null;
    }

}
