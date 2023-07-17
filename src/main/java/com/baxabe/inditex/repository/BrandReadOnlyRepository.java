// This is never used in project. Provided as example.
package com.baxabe.inditex.repository;

import com.baxabe.inditex.entity.impl.BrandEntityImpl;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandReadOnlyRepository extends BaseReadOnlyRepository<BrandEntityImpl, Long> {
}
