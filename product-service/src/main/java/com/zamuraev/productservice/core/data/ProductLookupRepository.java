package com.zamuraev.productservice.core.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductLookupRepository extends JpaRepository<ProductLookupEntity,String> {

    ProductLookupEntity findByProductIdOrTitle(String productId, String title);
}
