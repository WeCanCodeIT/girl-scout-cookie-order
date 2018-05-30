
public class CookieOrder {
	private String cookieVariety;
	private int numberOfBoxes;

	public CookieOrder(String cookieVariety, int numberOfBoxes) {
		this.cookieVariety = cookieVariety;
		this.numberOfBoxes = numberOfBoxes;
	}

	public String getCookieVariety() {
		return cookieVariety;
	}

	public void setCookieVariety(String cookieVariety) {
		this.cookieVariety = cookieVariety;
	}

	public int getNumberOfBoxes() {
		return numberOfBoxes;
	}

	public void setNumberOfBoxes(int numberOfBoxes) {
		this.numberOfBoxes = numberOfBoxes;
	}

}
