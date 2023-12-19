package com.ty;

import org.springframework.stereotype.Component;

@Component(value="myperson")
public class Person 
{
	public void run()
	{
		System.out.println("person is running"); 
	}

}
