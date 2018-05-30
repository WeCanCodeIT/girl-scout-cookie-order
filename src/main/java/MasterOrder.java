import java.util.ArrayList;

public class MasterOrder {
	private ArrayList<CookieOrder> cookieOrders = new ArrayList<>();

	public int getListSize() {
		return cookieOrders.size();
	}

	public void addOrder(CookieOrder cookieOrder) {
		cookieOrders.add(cookieOrder);
	}
}
