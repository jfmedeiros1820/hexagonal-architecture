package com.hexagonalarchitecture.infrastructure.repository.mongo;

import com.hexagonalarchitecture.domain.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SpringDataMongoOrderRepository extends MongoRepository<Order, UUID> {
}
