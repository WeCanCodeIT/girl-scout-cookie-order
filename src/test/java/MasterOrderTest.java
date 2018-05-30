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
}
