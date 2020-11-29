
public class Item {
	// Array of ability specifications
	protected int ability[];
	
	// Constructor
	public Item() {
		ability = new int[10];
	}
	
	// Gets ability type of item
	public int getType() {
		return ability[0];
	}
	
	// Gets specific value of item
	public int getValue(int location) {
		return ability[location];
	}
	
	// Sets value of item
	public void setValue(int location, int newValue) {
		ability[location] = newValue;
	}
}
