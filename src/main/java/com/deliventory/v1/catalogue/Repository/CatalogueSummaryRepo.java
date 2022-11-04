package com.deliventory.v1.catalogue.Repository;

import com.deliventory.v1.catalogue.ProductSummary;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CatalogueSummaryRepo extends MongoRepository<ProductSummary,Long> {
}
