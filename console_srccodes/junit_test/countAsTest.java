package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class countAsTest {

	@Test
	public void test() {
		JUnitTesting test = new JUnitTesting();
		int output = test.countAs("Alphabet");
		assertEquals(2, output);
		
	}

}
