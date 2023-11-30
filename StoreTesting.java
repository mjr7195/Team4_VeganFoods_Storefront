import static org.junit.jupiter.api.Assertions.*;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
public class StoreTesting {
        @Test
        public void testCalcTotal() {
            // Arrange
            Map<String, Integer> shopCart = new HashMap<>();
            shopCart.put("riot energy", 2);
            shopCart.put("guru organic", 3);

            Map<String, Double> itemPrices = new HashMap<>();
            itemPrices.put("riot energy", 37.09);
            itemPrices.put("guru organic", 29.99);

            // Act
            double totalPrice = VeganFoodsStore.calcTotal(shopCart, itemPrices);

            // Assert
            assertEquals(2 * 37.09 + 3 * 29.99, totalPrice, 0.001); // Using delta for double comparison
        }
    }
