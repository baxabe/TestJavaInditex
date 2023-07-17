package com.baxabe.inditex.repository;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.io.Serializable;
import java.util.Optional;

@NoRepositoryBean
@SuppressWarnings("java:S119")
public interface BaseReadOnlyRepository<T, ID extends Serializable> extends Repository<T, ID> {

    // This is never used in project. Provided as example.
    Optional<T> findById(ID id);

}
