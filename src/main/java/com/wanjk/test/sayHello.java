package com.wanjk.test;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface sayHello {
	@WebMethod
	public String hello(String name);
}
