package com.baxabe.inditex.repository;

import com.baxabe.inditex.entity.PriceByDateView;
import com.baxabe.inditex.entity.impl.PriceByDateViewImpl;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface PriceByDateReadOnlyRepository extends BaseReadOnlyRepository<PriceByDateViewImpl, Long> {

    @Query(
            """
                        SELECT pbd
                        FROM PriceByDateViewImpl pbd
                        WHERE
                            pbd.startDate <= :#{#date} AND
                            pbd.endDate >= :#{#date} AND
                            pbd.productId = :#{#productId} AND
                            pbd.brandId = :#{#brandId}
                    """
    )
    List<PriceByDateView> findByDate(
            @Param("date") Date date,
            @Param("productId") Long productId,
            @Param("brandId") Long brandId
    );

}
