package com.wanjk.server;


import javax.xml.ws.Endpoint;

import com.wanjk.test.sayHelloImpl;

public class myserver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String Url = "http://localhost:8083/mytest/hello";
		Endpoint.publish(Url, new sayHelloImpl());
		System.out.println("发布成功");
	}

}
