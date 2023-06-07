package com.baxabe.inditex.repository;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

@NoRepositoryBean
public interface BaseReadOnlyRepository<T, I> extends Repository<T, I> {
}