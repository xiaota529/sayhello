package com.wanjk.test;

import javax.jws.WebService;

@WebService
public class sayHelloImpl implements sayHello {

	public String hello(String name) {
		return "hello world" + name;
	}

}
