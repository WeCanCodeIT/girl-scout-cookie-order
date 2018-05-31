import org.junit.Assert;
import org.junit.Test;

public class MasterOrderTest {
	MasterOrder masterOrder = new MasterOrder();
	
	@Test
	public void shouldAddNewOrderToCookieOrders() {
		// Arrange
		int orderListSize = masterOrder.getListSize();
		
		// Act
		masterOrder.addOrder(new CookieOrder("Samoas", 2));
		int expectedListSize = orderListSize + 1;
		int underTest = masterOrder.getListSize();
		
		// Assert
		Assert.assertEquals(expectedListSize, underTest);
	}
	
	@Test
	public void shouldReturnTotalNumberOfBoxes() {
		// Arrange
		
		// Act
		masterOrder.addOrder(new CookieOrder("Thin Mints", 3));
		int underTest = masterOrder.getTotalBoxes();
		int expected = 3;
		
		Assert.assertEquals(expected, underTest);
		
		masterOrder.addOrder(new CookieOrder("Samoas", 2));
		underTest = masterOrder.getTotalBoxes();
		expected = 5;
		
		Assert.assertEquals(expected, underTest);
	}
}






