import java.util.ArrayList;

public class MasterOrder {
	private ArrayList<CookieOrder> cookieOrders = new ArrayList<>();

	public int getListSize() {
		return cookieOrders.size();
	}

	public void addOrder(CookieOrder cookieOrder) {
		cookieOrders.add(cookieOrder);
	}

	public int getTotalBoxes() {
		// Keep track of boxes from order to order
		int total = 0;

		// I need all of the orders
		for (CookieOrder cookieOrder : cookieOrders) {
			// I need to know how many boxes are in each
			int boxes = cookieOrder.getNumberOfBoxes();
			
			// I need a way to update all boxes
			total += boxes;
		}

		// return the total number of boxes
		return total;
		
		
		
	}
}
