
public class ItemApplication {
	// Lists ability types as strings for designer use
	private String effects[] = ['Deal Damage'];
	
	// Applies item to game
	// Uses list of if statements
	// Need to shorten if lost of different types of items
	public static void applyItem(Item item, Entity target) {
		if(item.getType() == 1) {
			target.takeDamage(item.getValue(1));
		}
	}
}
