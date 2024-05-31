package interval_oop;

public class interval {

	private int lowerbound;
	private int upperbound;
	
	
	public static int getLowerBound(interval interval) {
		return interval.lowerbound;
	}
	
	public static int getUpperBound(interval interval) {
		return interval.upperbound;
	}
	
	public static void setLowerBound(interval interval,int newLowerBound) {
		interval.lowerbound=newLowerBound;
	}
	
	public static void setUpperBound(interval interval, int newUpperBound) {
		interval.upperbound=newUpperBound;
	}
	
	
	
}
