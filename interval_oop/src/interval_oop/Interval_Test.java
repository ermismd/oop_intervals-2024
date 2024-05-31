package interval_oop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Interval_Test {

	@Test
	void testIntervals(){
		
		interval myInterval=new interval(3,7);
		
		
		
		int length=myInterval.getUpperBound()-myInterval.getLowerBound();
		assertEquals(4,length);
	}
	
	
	
	
	

}
