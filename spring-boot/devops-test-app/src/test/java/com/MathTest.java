package com;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.MathService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class MathTest {

	@Test
	public void addEqualTest() {
		MathService ms = new MathService();
		System.out.println("Running Add Test");
		Assertions.assertEquals(ms.add(), 5);
	}
	
	@Test
	public void addEqualTestTwo() {
		MathService ms = new MathService();
		System.out.println("Running Add Test");
		Assertions.assertTrue(ms.add() == 5);
	}
	
	@Test
	public void naddNllChueck()
	{
		MathService ms = new MathService();
		System.out.println("Running Add Test");
		Assertions.assertNotNull(ms, "Null Check Failed");
	}
	
	@Test
	public void addNotEqualSix() {
		MathService ms = new MathService();
		System.out.println("Running Add Test");
		Assertions.assertNotEquals(6, ms.add());
	}
	
	@Test
	public void addNotEqualSixWayTwo() {
		MathService ms = new MathService();
		System.out.println("Running Add Test");
		Assertions.assertTrue(ms.add() != 6);
	}
	
	
	@Test
	public void subEqualTest() {
		MathService ms = new MathService();
		System.out.println("Running Sub Test");
		Assertions.assertEquals(ms.sub(), 1);
	}
	
	@Test
	public void subEqualTestTwo() {
		MathService ms = new MathService();
		System.out.println("Running Sub Test");
		Assertions.assertTrue(ms.sub() == 1);
	}
	
	@Test
	public void subNullChueck()
	{
		MathService ms = new MathService();
		System.out.println("Running Sub Test");
		Assertions.assertNotNull(ms, "Null Check Failed");
	}
	
	@Test
	public void subNotEqualSix() {
		MathService ms = new MathService();
		System.out.println("Running Sub Test");
		Assertions.assertNotEquals(6, ms.sub());
	}
	
	@Test
	public void subNotEqualSixWayTwo() {
		MathService ms = new MathService();
		System.out.println("Running Sub Test");
		Assertions.assertTrue(ms.sub() != 6);
	}
	
}
