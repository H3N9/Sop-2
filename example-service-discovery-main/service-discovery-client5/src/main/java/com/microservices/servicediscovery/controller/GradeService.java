package com.microservices.servicediscovery.controller;

import java.util.List;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.microservices.servicediscovery.bean.Grade;

@RestController
public class GradeService {
	private String jsonString = "{'1':'SOP','2':'Mobile','3':'RE'}";
	private JsonObject jsonObject = (JsonObject) JsonParser.parseString(jsonString);
	
	private String jsonString2 = "{'1':'A','2':'A','3':'A'}";
	private JsonObject jsonObject2 = (JsonObject) JsonParser.parseString(jsonString2);

	@Autowired
	private DiscoveryClient discoveryClient;
	
	@RequestMapping("/service-instances/{applicationName}")
	public List<ServiceInstance> serviceInstancesByApplicationName(
			@PathVariable String applicationName) {
		return this.discoveryClient.getInstances(applicationName);
	}
	
	@RequestMapping("/v1/grade/{gradeId}")
	public Grade getStudent(@PathVariable String gradeId) {
		Grade g = new Grade();
		g.setId(gradeId);
		g.setName(jsonObject.get(gradeId).getAsString());
		g.setPoint(jsonObject2.get(gradeId).getAsString());
		return g;
	}
}
