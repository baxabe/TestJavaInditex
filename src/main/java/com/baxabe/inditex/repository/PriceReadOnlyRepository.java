// This is never used in project. Provided as example.
package com.baxabe.inditex.repository;

import com.baxabe.inditex.entity.impl.PriceEntityImpl;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceReadOnlyRepository extends BaseReadOnlyRepository<PriceEntityImpl, Long> {
}
