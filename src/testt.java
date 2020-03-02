import static org.junit.Assert.*;


import org.junit.Test;

import calculator.adding;

public class testt {

	@Test
	public void testAdd() {
		adding a=new adding();
		int x=a.add(2,3);
		assertEquals(5,x);
	}

}
