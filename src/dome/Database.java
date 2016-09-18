package dome;

import java.util.ArrayList;

public class Database {

	private ArrayList<Item> listItem = new ArrayList<>();
	
	
	public void add(Item item){
		listItem.add(item);
	}
	
	public void list(){
		for (Item item : listItem) {
			item.print();
		}
	}
	
}
