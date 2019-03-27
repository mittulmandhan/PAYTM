package com.paytm.PAYTM;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

	@GetMapping(path="hello")
	//@RequestMapping(path="hello", method=RequestMethod.GET)
	public String greet(){
		return "Hello World!!!";
	}
	
	@RequestMapping(path="sample", method=RequestMethod.GET)
	public String sample(){
		return "Sample output!!!";
	}
	
}
