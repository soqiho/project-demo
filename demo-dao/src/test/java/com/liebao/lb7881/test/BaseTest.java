/**
 * 
 */
package com.liebao.lb7881.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author pan
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:/spring/spring-main.xml")

public class BaseTest {
	
	@Test
	public void test(){
		
		System.out.println("**********************");
	}
	
}
