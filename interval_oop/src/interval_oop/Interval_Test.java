package interval_oop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Interval_Test {



	
	
	
	@Test
	void testIntervals(){
		
		interval myInterval=new interval();
		myInterval.setLowerBound( 3);
		myInterval.setUpperBound( 7);
		
		
		int length=myInterval.getUpperBound()-myInterval.getLowerBound();
		assertEquals(4,length);
	}
	
	
	
	
	

}
