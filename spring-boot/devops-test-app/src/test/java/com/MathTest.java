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
	public void testMessage() {
		MathService ms = new MathService();
		System.out.println("Running Add Test");
		Assertions.assertEquals(ms.add(), 5);
	}
	
}
