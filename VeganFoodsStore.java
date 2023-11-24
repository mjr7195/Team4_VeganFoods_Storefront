import java.util.*;
import java.util.regex.*;


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

        //holds item names with prices
        Map<String, Double> itemNamesPrices = new TreeMap<>();
        //puts item names and prices into itemNamesPrices
        itemNamesPrices = inventory.getVeganNamePrice();

        //holds customer id and name to welcome customer
        Map<Integer, String> custIDName = new TreeMap<>();

        System.out.println("Welcome to our vegan food store!");

        System.out.println("Are you interested in creating an account with us?");
        String newReturnCust = scanner.nextLine().toLowerCase();
        //Regular expressions
        String emailcheck = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        Pattern pattern = Pattern.compile(emailcheck);

        if  (newReturnCust.equals("yes")){
            Random rand = new Random();
            int custID = rand.nextInt();
            System.out.println("Please fill in the info needed: ");
            System.out.println("First Name: ");
            String fName = scanner.nextLine();
            System.out.println("Last Name: ");
            String lName = scanner.nextLine();
            System.out.println("Address: ");
            String address = scanner.nextLine();
            System.out.println("Address 2 (or null for no second address: ");
            String address2 = scanner.nextLine();
            System.out.println("City: ");
            String city = scanner.nextLine();
            System.out.println("State (Abbreviation only): ");
            String state = scanner.nextLine();
            while(state.length() > 2){
                System.out.println("Please only use the Abbreviation of the State:");
                state = scanner.nextLine();
            }
            System.out.println("Zip Code: ");
            String zipCode = scanner.nextLine();
            while(zipCode.length() > 5){
                System.out.println("Please enter only 5 digits");
                zipCode = scanner.nextLine();
            }
            System.out.println("Email: ");
            String email = scanner.nextLine();
            Matcher matcher = pattern.matcher(email);
            while (!matcher.matches()){
                System.out.println("Please input a valid email:");
                email = scanner.nextLine();
                matcher = pattern.matcher(email);
            }
            System.out.println("Phone Number: ");
            String phoneNum = scanner.nextLine();
        }

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
            String returnItem;
            System.out.println("Please input the name of the item you want to add into your shopping cart from the list above.");
            System.out.println("enter 'remove' to remove an item from your cart");
            System.out.println("Enter 'return' to return an item.");
            System.out.println("when finished input 'done' to checkout. ");
            String userInput = scanner.nextLine().toLowerCase();

            if (userInput.equals("done")){
                break;
            }

            if (userInput.equals("return")){
                System.out.println("Please enter the name of the item you want to return: ");
                returnItem = scanner.nextLine().toLowerCase();
                if (itemNamesPrices.containsKey(returnItem)){
                    double moneyReturn = itemNamesPrices.get(returnItem);
                    System.out.println("The amount returned is $" + moneyReturn);
                }else{
                    System.out.println("Sorry, we do not sell this item so we can not issue refund.");
                }
            }

            if (userInput.equals("remove")){
                System.out.println("Please enter the item that you want to remove: ");
                String itemToRemove = scanner.nextLine().toLowerCase();
                System.out.println("How many of " + itemToRemove + " do you want to remove");
                int removeQuan = scanner.nextInt();

                if (shoppingCart.isEmpty()){
                    System.out.println("Shopping cart is empty");
                }
                else if (itemNamesPrices.containsKey(itemToRemove)) {
                    int quantity = shoppingCart.get(itemToRemove);
                    while(removeQuan > quantity){
                        System.out.println("remove amount is greater than item quantity in cart, Please enter an appropriate amount:");
                        removeQuan = scanner.nextInt();
                    }

                    if (quantity == removeQuan){
                        shoppingCart.remove(itemToRemove);
                        System.out.println(itemToRemove+ " has been removed.");
                    }else{
                        shoppingCart.put(itemToRemove, quantity - removeQuan);
                        System.out.println(itemToRemove + " has been removed " + removeQuan + " times");
                    }
                }else {
                    System.out.println("Item entered is not in cart.");
                }
            }
            if (itemNamesPrices.containsKey(userInput)){
                System.out.println("How many of "+ userInput + " do you want to add?");
                int prodQuantity = scanner.nextInt();
                shoppingCart.put(userInput, prodQuantity);
                System.out.println(userInput + " has been added to cart.");
            }else{
                System.out.println("This item is not available");
            }
        }
        System.out.println(shoppingCart);
        double totalInvoice = calcTotal(shoppingCart, itemNamesPrices);
        System.out.println("The total for your items today is $" + totalInvoice);
    }

    public static double calcTotal(Map<String, Integer> shopCart, Map<String, Double> itemPrices ){
        double totalPrice = 0;
        System.out.println("Shopping Receipt:");
        for (Map.Entry<String, Integer> entry : shopCart.entrySet()){
            String cartItem = entry.getKey();
            int quantity = entry.getValue();
            double price = itemPrices.get(cartItem);
            System.out.println("Product: "+ cartItem + ", Quantity: " + quantity + ", Price: " + price);
            totalPrice += price * quantity;
        }
        return totalPrice;
    }
}
