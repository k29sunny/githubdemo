package com.sunny.rest.webservices.restfulwebservices.helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	//@RequestMapping(method=RequestMethod.GET,path="/helloRest")
	@GetMapping(path="/helloRest")
	public String HelloWorld() {
		return "Hello World Sunny";
	}
	
	@GetMapping(path="/helloRestBean")
	public HelloWorldBean HelloWorldBean() {
		return new HelloWorldBean("Hello World Sunny Bean");
	}
	
	@GetMapping(path="/helloRestBean/pathVariable/{name}")
	public HelloWorldBean HelloWorldBeanPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World, %s", name));
	}

}
