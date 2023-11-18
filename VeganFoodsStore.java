import java.util.*;

/**+ class VeganFoodsStore is the main class, where main functions occur
 * @author Marcos, Joel, Cooper, Nafis
 */
public class VeganFoodsStore {
    /** main method */
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        VeganEnergyDrink riotEnergy = new VeganEnergyDrink(1, "riot energy", "Riot Energy", 37.09, "Berry", 160, 16);
        VeganEnergyDrink guruEnergy = new VeganEnergyDrink(2, "guru organic", "Guru", 29.99, "Grape",142, 12);
        VeganEnergyDrink sambazonEnergy = new VeganEnergyDrink(3, "acai berry", "Sambozan", 31.59, "Passionfruit", 120, 12);
        VeganEnergyDrink zeviaEnergy = new VeganEnergyDrink(4, "zevia zero calorie energy", "Zevia", 24.98, "Watermelon", 120, 12);
        VeganEnergyDrink celsiusEnergy = new VeganEnergyDrink(5, "celsius live fit energy", "Celsius", 19.32, "Strawberry", 200, 12);
        VeganEnergyDrink odysseyEnergy = new VeganEnergyDrink(6, "odyssey sparkling mushroom elixir", "Odyssey", 41.99, "Orange Ginger", 85, 12);
        VeganBowl QuinoaBowl = new VeganBowl(7, "quinioa and broccoli", "House", 12.99, "Salt and Pepper", "Quinoa", "Broccoli" );
        VeganBowl riceBowl = new VeganBowl(8, "rice and beans", "House", 13.99, "Salt, Pepper, Thyme, Cumin and Chili Powder", "Quinoa", "Broccoli" );
        VeganMeat phillySteakPieces = new VeganMeat(9, "paow phillypieces", "POAW", 21.99, "Steak", 90 );
        VeganMeat veggieBurger = new VeganMeat(10, "organic black bean veggie burger", "Amy's", 23.99, "Black Bean", 130);
        VeganChips beanChips = new VeganChips(11, "beanfields bean chips", "Beanfields", 10.99, "nacho", 130);
        VeganChips veggieChips = new VeganChips(12, "veggie chips", "Nuts", 9.99, "vegtable asortment", 196);

        //add vegan Items to store inventory
        VeganFoodInventory inventory = new VeganFoodInventory();
        inventory.addVeganItem(riotEnergy);
        inventory.addVeganItem(guruEnergy);
        inventory.addVeganItem(sambazonEnergy);
        inventory.addVeganItem(zeviaEnergy);
        inventory.addVeganItem(celsiusEnergy);
        inventory.addVeganItem(odysseyEnergy);
        inventory.addVeganItem(QuinoaBowl);
        inventory.addVeganItem(riceBowl);
        inventory.addVeganItem(phillySteakPieces);
        inventory.addVeganItem(veggieBurger);
        inventory.addVeganItem(beanChips);
        inventory.addVeganItem(veggieChips);

        Map<String, Double> itemNamesPrices = new TreeMap<>();
        itemNamesPrices = inventory.getVeganNamePrice();


        System.out.println("Welcome to our vegan food store!");
        System.out.println("These are our available products:");
        //list all items in inventory with price and brand
        inventory.listAllItems();

        System.out.println(itemNamesPrices);

        //create shopping cart
        HashMap<String, Integer> shoppingCart = new HashMap<>();
        System.out.println();
       // for (Map.Entry<Integer, Double> entry : itemPrices.entrySet()){
           // System.out.println("ID: " + entry.getKey()+", Price: " + entry.getValue());
       // }
        while (true){
            System.out.println("Please input the name of the item you want to add into your shopping cart from the list above (or type 'remove' to remove an item from your cart): ");
            System.out.println("When finished, type in 'done' to checkout.");
            String prodChoice = scanner.nextLine().toLowerCase();

            System.out.println("How many of "+ prodChoice + " do you want to add?");
            int prodQuantity = scanner.nextInt();

            if (prodChoice.equals("done")){
                break;
            }

            if (prodChoice.equals("remove")){
                System.out.println("Please enter the item that you want to remove: ");
                String itemToRemove = scanner.nextLine().toLowerCase();

                if (itemNamesPrices.containsKey(itemToRemove)) {
                    int quantity = shoppingCart.get(itemToRemove);
                    if (quantity > 1) {
                        shoppingCart.put(itemToRemove, quantity - 1);
                        System.out.println(itemToRemove + " has been removed.");
                    } else {
                        shoppingCart.remove(itemToRemove);
                        System.out.println(itemToRemove+ " has been removed.");
                    }
                }else{
                    System.out.println("Item inputed is not in cart");
                }
            }else{
                if (itemNamesPrices.containsKey(prodChoice)){
                    shoppingCart.put(prodChoice, prodQuantity);
                    System.out.println(prodChoice + " has been added to cart.");
                }else{
                    System.out.println("This item is not available");
                }
            }


        }
        System.out.println(shoppingCart);
    }
}
