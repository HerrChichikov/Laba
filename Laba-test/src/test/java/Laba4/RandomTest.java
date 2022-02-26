package Laba4;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomTest {

	@Test
	public void test() {
		
		Random test1 = new Random();
		
		if((test1.Rand()<45) || (test1.Rand()>75)) {
		fail("Not yet implemented");
		}
		}
}