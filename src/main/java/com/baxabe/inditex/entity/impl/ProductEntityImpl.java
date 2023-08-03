package com.baxabe.inditex.entity.impl;

import com.baxabe.inditex.entity.ProductEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.lang.NonNull;

@Entity
@Table(name = "PRODUCTS")
public class ProductEntityImpl extends BaseEntityImpl implements ProductEntity {

    @NonNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

}
