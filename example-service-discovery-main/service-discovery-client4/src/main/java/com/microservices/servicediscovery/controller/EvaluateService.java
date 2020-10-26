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
import com.microservices.servicediscovery.bean.Evaluation;

@RestController
public class EvaluateService {
	private String jsonString = "{'1':'Anek','2':'Somsak','3':'Pavin'}";
	private String jsonString2 = "{'1':20,'2':98,'3':99}";
	private JsonObject jsonObject = (JsonObject) JsonParser.parseString(jsonString);
	private JsonObject jsonObject2 = (JsonObject) JsonParser.parseString(jsonString2);

	@Autowired
	private DiscoveryClient discoveryClient;
	
	@RequestMapping("/service-instances/{applicationName}")
	public List<ServiceInstance> serviceInstancesByApplicationName(
			@PathVariable String applicationName) {
		return this.discoveryClient.getInstances(applicationName);
	}
	
	@RequestMapping("/v1/evaluate/{evaluateID}")
	public Evaluation getStudent(@PathVariable String evaluateID) {
		Evaluation e = new Evaluation();
		e.setId(evaluateID);
		e.setName(jsonObject.get(evaluateID).getAsString());
		e.setPoint(jsonObject2.get(evaluateID).getAsString());
		return e;
	}
}
