package com.baxabe.inditex.repository;

import com.baxabe.inditex.entity.BrandRoEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandReadOnlyRepository extends BaseReadOnlyRepository<BrandRoEntity, Long> {
}
