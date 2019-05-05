package com.quest.rpc.comsumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.quest.rpc.api.SayHello;

public class Hello {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/applicationContext-dubbo-consumer.xml"});
        context.start();
        SayHello sayHello = (SayHello) context.getBean("sayHello"); 
        sayHello.sayHello();
	}

}
