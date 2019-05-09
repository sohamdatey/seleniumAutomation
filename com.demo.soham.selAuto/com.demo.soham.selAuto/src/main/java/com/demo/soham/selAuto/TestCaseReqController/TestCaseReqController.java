package com.demo.soham.selAuto.TestCaseReqController;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.soham.selAuto.model.AddTestResource;

@RestController
public class TestCaseReqController {

	

	@RequestMapping(value = "/hello", method = RequestMethod.GET, produces = "application/json")
	String hello() {
		
		return "hello";
    }
	
	@RequestMapping(value = "/createUser", method = RequestMethod.POST, produces = "application/json")
	void addTest(@RequestBody AddTestResource addTestResource) {

		System.out.println(addTestResource);
	}

}