package test;

import com.kuke.webservice.HelloWorld;
import com.kuke.webservice.HelloWorldImpl;

public class TestWSService {

	public static void main(String[] args) {
		
		HelloWorld hw = new HelloWorldImpl().getHelloWorldImplPort();
		String sayHello = hw.sayHello("lmq");
		System.out.println(sayHello);
	}
	
}
