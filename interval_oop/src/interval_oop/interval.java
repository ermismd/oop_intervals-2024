package interval_oop;

public class interval {

	private int lowerbound;
	private int length;
	
	
	public int getLowerBound() {
		return this.lowerbound;
	}
	
	public int getUpperBound() {
		return this.length+this.lowerbound;
	}
	
	public interval(int initialLowerbound,int initialUpperBound) {
		this.lowerbound=initialLowerbound;
		this.length=initialUpperBound-initialLowerbound;
	}
	
	public  void setLowerBound(int newLowerBound) {
		this.lowerbound=newLowerBound;
	}
	
	public  void setUpperBound( int newUpperBound) {
		this.length=newUpperBound-this.lowerbound;
	}
	
	
	
}
