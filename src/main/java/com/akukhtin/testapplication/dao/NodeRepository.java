package com.akukhtin.testapplication.dao;

import com.akukhtin.testapplication.entity.BaseNode;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface NodeRepository extends ReactiveMongoRepository<BaseNode, Long> {

}
