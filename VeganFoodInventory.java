import java.util.ArrayList;
import java.util.List;
public class VeganFoodInventory {
   private List<VeganFoodItem> veganItems;

   public VeganFoodInventory(){ veganItems = new ArrayList<>(); }

    public void addVeganItem(VeganFoodItem veganItem){ veganItems.add(veganItem); }

}
