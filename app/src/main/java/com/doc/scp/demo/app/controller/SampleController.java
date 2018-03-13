package com.doc.scp.demo.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.doc.scp.demo.app.config.DemoRepository;
import com.doc.scp.demo.app.type.Sample;

@RestController
public class SampleController {

	@Autowired
	private DemoRepository demoRepository;

	@GetMapping("/samples/{id}")
	public Optional<Sample> getSampleById(@PathVariable("id") String id) {
		return demoRepository.findById(id);
	}

	@GetMapping("/samples")
	public List<Sample> getSampleByCode(@RequestParam String code) {
		return demoRepository.findByCode(code);
	}

}
