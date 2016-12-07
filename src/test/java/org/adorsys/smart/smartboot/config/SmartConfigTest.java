package org.adorsys.smart.smartboot.config;

import org.junit.Test;

public class SmartConfigTest {

	static enum ABC {
		a, b;	
	}
	
	@Test
	public void test() {

		System.out.println("test" + ABC.valueOf(null));	
	}

}
