package me.prince.mavenCoverage.test;

import static org.junit.Assert.*;
import me.prince.mavenCoverage.*;

import org.junit.Test;

public class MyServiceTest {

	@Test
	public void testConverage() {
		MyService service = new MyService();
		service.converage();
		
		service.converage1();
		
		service.converage2();
		
		service.converage3();
		
		service.converage4();
	}
	
	
	@Test
	public void testConverage1() {
		MyService1 service = new MyService1();
		service.converage();
		
		service.converage1();
		
		service.converage2();
		
		service.converage3();
		
		service.converage4();
	}

	@Test
	public void testConverage2() {
		MyService2 service = new MyService2();
		service.converage();
		
		service.converage1();
		
		service.converage2();
		
		service.converage3();
		
		service.converage4();
	}
}
