import java.util.ArrayList;
import java.util.List;
public class VeganFoodInventory {
   private List<VeganFoodItem> veganItems;

   public VeganFoodInventory(){ veganItems = new ArrayList<>(); }

    public void addVeganItem(VeganFoodItem veganItem){ veganItems.add(veganItem); }

    public void listAllItems(){
       System.out.println("Vegan Items:");
       for (VeganFoodItem veganItem : veganItems){
          System.out.println("ID: "+ veganItem.getId() + ", Brand: "+ veganItem.getBrand() + ", Price: $"+ veganItem.getPrice());
       }

    }

}
