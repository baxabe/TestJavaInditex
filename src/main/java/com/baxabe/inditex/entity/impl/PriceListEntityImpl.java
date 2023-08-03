package com.baxabe.inditex.entity.impl;

import com.baxabe.inditex.entity.PriceListEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.lang.NonNull;

@Entity
@Table(name = "PRICES_LIST")
public class PriceListEntityImpl extends BaseEntityImpl implements PriceListEntity {

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
