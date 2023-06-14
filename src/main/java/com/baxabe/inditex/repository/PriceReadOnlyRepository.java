package com.baxabe.inditex.repository;

import com.baxabe.inditex.entity.PriceRoEntity;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PriceReadOnlyRepository extends BaseReadOnlyRepository<PriceRoEntity, Long> {

    List<PriceRoEntity> findByStartDateIsBeforeAndEndDateIsAfterAndProductIdAndBrandIdOrderByPriorityDesc(
            LocalDateTime startDate, LocalDateTime endDate, Long productId, Long brandId);

}
