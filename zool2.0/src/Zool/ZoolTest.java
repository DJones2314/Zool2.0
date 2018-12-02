package Zool;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class ZoolTest {

	String testing = "";

	@Test
	public void welcomeMessageTest() {
		Map testMap = new Map();
		assertEquals("Correct welcome message displayed", testMap.welcomeToMap(), "....");
	}

	@Test
	public void navigationTest() {
		Map testNav = new Map();
		assertEquals("The navigation system isn't working", testNav.navigate(testing), null);
	}

	@Test
	public void inputTest() {
		Navigate testIntOrChar = new Navigate();
		assertTrue("boolean was false", testIntOrChar.getintOrChar(null));
	}
	
	@Test
	public void 

}
