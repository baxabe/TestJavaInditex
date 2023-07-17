package com.baxabe.inditex.entity.impl;

import com.baxabe.inditex.entity.BaseView;
import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;
import org.springframework.lang.NonNull;

@MappedSuperclass
public class BaseViewImpl implements BaseView {

    @Id
    @Immutable
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", insertable = false, updatable = false)
    protected Long id;

    @NonNull
    public Long getId() {
        return id;
    }

    public void setId(@NonNull Long id) {
        this.id = id;
    }

}
