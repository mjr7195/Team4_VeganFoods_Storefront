import java.util.ArrayList;
import java.util.List;

/**+ class VeganFoodInventory creates a list ans stores the items
 * @author Marcos
 */
public class VeganFoodInventory {
    /**+
     * the veganItems list holds all inventory items
     */
   private List<VeganFoodItem> veganItems;

   /** Constructor method that that creates list*/
   public VeganFoodInventory(){ veganItems = new ArrayList<>(); }

    /** method addVeganItems puts items into list */
    public void addVeganItem(VeganFoodItem veganItem){ veganItems.add(veganItem); }

    /** method listAllItems display all items in inventory */
    public void listAllItems(){
       System.out.println("Vegan Items:");
       for (VeganFoodItem veganItem : veganItems){
          System.out.println("ID: "+ veganItem.getId() + ", Brand: "+ veganItem.getBrand() + ", Price: $"+ veganItem.getPrice());
       }

    }

}
