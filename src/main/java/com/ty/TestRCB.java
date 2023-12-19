package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRCB
{
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("my_config.xml");
		
		RCB r= (RCB) context.getBean("RCB");
		
		r.win();
	}

}
