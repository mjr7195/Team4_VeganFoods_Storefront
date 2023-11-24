import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**+ class VeganFoodInventory creates a list and stores the items
 * @author Marcos
 */
public class VeganFoodInventory {
    /**+
     * the veganItems list holds all inventory items
     */
   private List<VeganFoodItem> veganItems;

   /** Constructor method that creates list*/
   public VeganFoodInventory(){ veganItems = new ArrayList<>(); }

    /** method addVeganItems puts items into list */
    public void addVeganItem(VeganFoodItem veganItem){ veganItems.add(veganItem); }

    /** method listAllItems display all items in inventory */
    public void listAllItems(){
       System.out.println("Vegan Items:");
       for (VeganFoodItem veganItem : veganItems){
          System.out.println( "Brand: "+ veganItem.getBrand() + ", Name: "+ veganItem.getName() + ", Flavor: "+ veganItem.getFlavor() + ", Price: $"+ veganItem.getPrice());
       }

    }
    /** method getVeganNamePrice puts inventory item names and prices into a treemap */
    public Map<String, Double> getVeganNamePrice(){
        Map<String, Double> namePrice = new TreeMap<>();
        for (VeganFoodItem veganItem : veganItems){
           namePrice.put(veganItem.getName(), veganItem.getPrice());
        }
        return namePrice;
    }


}
