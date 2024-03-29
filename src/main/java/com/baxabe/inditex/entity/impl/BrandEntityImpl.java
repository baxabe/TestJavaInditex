package com.baxabe.inditex.entity.impl;

import com.baxabe.inditex.entity.BrandEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.lang.NonNull;

@Entity
@Table(name = "BRANDS")
public class BrandEntityImpl extends BaseEntityImpl implements BrandEntity {

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
