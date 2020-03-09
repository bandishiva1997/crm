package com.crm;

import org.junit.Assert;
import org.junit.Test;

import com.crm.service.DemoService;

public class TestDemoService {

	@Test
	public void test() {
		
		DemoService ds=new DemoService();
		Assert.assertEquals("hello",ds.sayHello());
		}
}
