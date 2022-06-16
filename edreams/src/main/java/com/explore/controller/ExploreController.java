package com.explore.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class ExploreController {
	
	@GetMapping(value = "/health")
	public @ResponseBody ResponseEntity<String> checkHealth() throws Exception{	
		return new ResponseEntity<>("App is running !!!!", HttpStatus.OK);
	}
	
	@GetMapping(value = "/kpi")
	public @ResponseBody ResponseEntity<String> kpi() throws Exception{
		return null;
		
	}

}
