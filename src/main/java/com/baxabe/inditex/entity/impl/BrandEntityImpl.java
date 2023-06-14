package com.baxabe.inditex.entity.impl;

import com.baxabe.inditex.entity.BrandRoEntity;
import com.baxabe.inditex.entity.BrandRwEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.lang.NonNull;

@Entity
@Table(name = "BRANDS")
public class BrandEntityImpl extends BaseEntityImpl implements BrandRoEntity, BrandRwEntity {

    @NonNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
