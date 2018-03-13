package com.doc.scp.demo.app.reactive.config;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.doc.scp.demo.app.reactive.type.Sample;

import reactor.core.publisher.Flux;

public interface DemoRepository extends ReactiveCrudRepository<Sample, String> {

	Flux<Sample> findByCode(String code);

}
