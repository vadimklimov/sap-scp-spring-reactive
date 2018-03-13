package com.doc.scp.demo.app.config;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.doc.scp.demo.app.type.Sample;

public interface DemoRepository extends MongoRepository<Sample, String> {

	List<Sample> findByCode(String code);

}
