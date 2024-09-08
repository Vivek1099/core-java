package com.briz.dspmu;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//@RequestMapping("/facebook")

@RestController
public class MyController {
	@RequestMapping("/test")
	public String test()
	{
		return "Springboot Demo project";
	}
	@RequestMapping("/{name}")
	public String test(@PathVariable String name)
	{
		return "Hello "+name;
	}
	@RequestMapping("/{name}/{age}")
	public String hello(@PathVariable String name,@PathVariable int age)
	{
		return "Hello "+name+" u are "+age+" old";
	}
	@RequestMapping("/name/{name:[a-z]{5}}")
	public String we(@PathVariable String name)
	{
		return "this is hello welcome path"+name;
	}

}
