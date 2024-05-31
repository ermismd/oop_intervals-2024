package interval_oop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Interval_Test {



	
	
	
	@Test
	void testIntervals(){
		
		interval myInterval=new interval();
		interval.setLowerBound(myInterval, 3);
		interval.setUpperBound(myInterval, 7);
		
		
		int length=interval.getUpperBound(myInterval)-interval.getLowerBound(myInterval);
		assertEquals(4,length);
	}
	
	
	
	
	

}
