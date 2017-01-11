import static org.junit.Assert.*;

import org.junit.Test;


public class MainTest {

	@Test
	public void test() {
	assertEquals(true,Main.calculateLeapYear(2016));
	}
	
	@Test
	public void test2() {
	assertEquals(false,Main.calculateLeapYear(2015));
	}
	
	@Test
	public void test3() {
	assertEquals(null,Main.calculateLeapYear(F));
	}
	
}