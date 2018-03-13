package com.doc.scp.demo.app.reactive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.doc.scp.demo.app.reactive.config.DemoRepository;
import com.doc.scp.demo.app.reactive.type.Sample;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class SampleController {

	@Autowired
	private DemoRepository demoRepository;

	@GetMapping("/samples/{id}")
	public Mono<Sample> getSampleById(@PathVariable("id") String id) {
		return demoRepository.findById(id);
	}

	@GetMapping("/samples")
	public Flux<Sample> getSampleByCode(@RequestParam String code) {
		return demoRepository.findByCode(code);
	}

}
