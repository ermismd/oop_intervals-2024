package interval_oop;



/**
 * 
 * @invar|this.getLowerBound()<=this.getUpperBound()
 * @invar|this.getLength()==this.getUpperBound()-this.getLowerBound()
 * 
 */
public class interval {

	private int lowerbound;
	private int length;
	
	
	public int getLowerBound() {
		return this.lowerbound;
	}
	
	public int getUpperBound() {
		return this.length+this.lowerbound;
	}
	public int getLength() {
		return this.length;
	}
	
	/**
	 * 
	 * @pre|initialLowerBound<=initialUpperBound
	 * @post|getLowerBound()==initialLowerBound
	 * @post|getUpperBound()==initialUpperBound
	 * 
	 */
	public interval(int initialLowerBound,int initialUpperBound) {
		this.lowerbound=initialLowerBound;
		this.length=initialUpperBound-initialLowerBound;
	}
	
	/**
	 * @pre|newLowerBound<=getUpperBound()
	 * 
	 * @mutates|this
	 * 
	 * @post|getLowerBound()==newLowerBound
	 * @post|getLength()==old(getLength())
	 * 
	 */
	public  void setLowerBound(int newLowerBound) {
		this.lowerbound=newLowerBound;
	}
	
	/**
	 * 
	 * @pre|newUpperBound>=getLowerBound()
	 * 
	 * @mutates|this
	 * 
	 * @post|getLength()== newUpperBound-getLowerBound()
	 * @post|getUpperBound()==newUpperBound
	 * 
	 * 
	 */
	public  void setUpperBound( int newUpperBound) {
		this.length=newUpperBound-this.lowerbound;
	}
	
	
	
}
