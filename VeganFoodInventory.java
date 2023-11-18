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

   /** Constructor method that that creates list*/
   public VeganFoodInventory(){ veganItems = new ArrayList<>(); }

    /** method addVeganItems puts items into list */
    public void addVeganItem(VeganFoodItem veganItem){ veganItems.add(veganItem); }

    /** method listAllItems display all items in inventory */
    public void listAllItems(){
       System.out.println("Vegan Items:");
       for (VeganFoodItem veganItem : veganItems){
          System.out.println("ID: "+ veganItem.getId() + ", Brand: "+ veganItem.getBrand() + ", Name: "+ veganItem.getName() + ", Flavor: "+ veganItem.getFlavor() + ", Price: $"+ veganItem.getPrice());
       }

    }
    public Map<Integer, Double> getVeganId(){
        Map<Integer, Double> idPrice = new TreeMap<>();
        for (VeganFoodItem veganItem : veganItems){
           idPrice.put(veganItem.getId(), veganItem.getPrice());
        }
        return idPrice;
    }
    public Map<Integer, String> getVeganName(){
        Map<Integer, String> idName = new TreeMap<>();
        for (VeganFoodItem veganItem : veganItems){
            idName.put(veganItem.getId(), veganItem.getName());
        }
        return idName;
    }

}
