import java.util.*;
import java.util.regex.*;
import java.sql.*;

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

        System.out.println("Welcome to our vegan food store!");

        System.out.println("Are you interested in creating an account with us? Enter 'yes' to register or any key to skip.");
        String newReturnCust = scanner.nextLine().toLowerCase();

        // adds new customer info into database
        if  (newReturnCust.equals("yes")){
            newCustSignUp();
        }

        //holds order id and order to check for returns
        Map<Integer, Double> returnOrder = new TreeMap<>();
        //puts order id and order total into returnOrder for return checks
        String orderQuery = "SELECT fldOrderId, fldOrderTotal FROM tblOrders";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/vegan_foods_store", "root", "jemgum5d");

            PreparedStatement preparedStatement = conn.prepareStatement(orderQuery);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
                int orderId = rs.getInt("fldOrderId");
                double ordertotal = rs.getDouble("fldOrderTotal");

                returnOrder.put(orderId, ordertotal);
            }
        }catch(Exception e){ System.out.println(e);}


        ArrayList<Customer> customers = new ArrayList<>();
        //get Customer info from database
        String query = "SELECT * FROM tblCustomers";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/vegan_foods_store", "root", "jemgum5d");

            PreparedStatement preparedStatement = conn.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();

            while(rs.next()){
                Customer customer = new Customer(rs.getInt("fldCustomerId"), rs.getString("fldFName"), rs.getString("fldLName"), rs.getString("fldAddress"), rs.getString("fldAddress2"),
                        rs.getString("fldCity"), rs.getString("fldState"), rs.getString("fldZipCode"), rs.getString("fldEmail"), rs.getString("fldPhoneNumber"), rs.getInt("fldStoreVisits"));

                customers.add(customer);
            }
        }catch(Exception e){ System.out.println(e);}

        int currentCustID = 0;
        String currentCustFName = "";
        String currentCustLName = "";
        String currentCustaddress = "";
        String currentCustaddress2 = "";
        String currentCustCity = "";
        String currentCustState = "";
        String currentCustZipCode = "";
        String currentCustEmail = "";
        String currentCustPhoneNum = "";
        int currentCustStoreVisits = 0;

        // to check customer ID
        int custID;
        int checkCustID = 0;
        do{
            System.out.println("Please enter your customer ID number (IMPORTANT: If prompt pops up again customer ID is invalid):");
            custID = scanner.nextInt();
            for (int i = 0; i < customers.size(); i++) {
                Customer currentCust = customers.get(i);
                checkCustID = currentCust.getId();
                if (custID == currentCust.getId()) {
                    currentCustID = currentCust.getId();
                    currentCustFName = currentCust.getfName();
                    currentCustLName = currentCust.getlName();
                    currentCustaddress = currentCust.getAddress();
                    currentCustaddress2 = currentCust.getAddress2();
                    currentCustCity = currentCust.getCity();
                    currentCustState = currentCust.getState();
                    currentCustZipCode = currentCust.getZipCode();
                    currentCustEmail = currentCust.getEmail();
                    currentCustPhoneNum = currentCust.getPhoneNum();
                    currentCustStoreVisits = currentCust.getStoreVisits();
                    break;
                }
            }
        }while(custID != checkCustID);

        System.out.println("Welcome " + currentCustFName);
        System.out.println("These are our available products:");
        //list all items in inventory with price and brand
        inventory.listAllItems();

        //create shopping cart
        HashMap<String, Integer> shoppingCart = new HashMap<>();
        int quantity = 0;
        int prodQuantity = 0;
        int totalQuantity = 0;
        String userInput;
        System.out.println();// For Readability.
       // for (Map.Entry<Integer, Double> entry : itemPrices.entrySet()){
           // System.out.println("ID: " + entry.getKey()+", Price: " + entry.getValue());
       // }
        while (true){
            int returnId;
            System.out.println("Please input the name of the item you want to add into your shopping cart from the list above.");
            System.out.println("Enter 'remove' to remove an item from your cart.");
            System.out.println("Enter 'return' to return an item.");
            System.out.println("when finished input 'done' to checkout. ");
            userInput = scanner.nextLine().toLowerCase();
            scanner.nextLine();

            if (userInput.equals("done")){
                break;
            }

            else if (userInput.equals("return")){
                System.out.println("Please enter the order ID of the order you want to return: ");
                returnId = scanner.nextInt();
                scanner.nextLine();
                if (returnOrder.containsKey(returnId)){
                    double moneyReturn = returnOrder.get(returnId);
                    System.out.println("The amount returned is $" + moneyReturn);
                    scanner.nextLine();
                }else{
                    System.out.println("Sorry, order ID is invalid.");
                    scanner.nextLine();
                }
            }
            else if (userInput.equals("remove")){
                System.out.println("Please enter the item that you want to remove: ");
                String itemToRemove = scanner.nextLine().toLowerCase();
                scanner.nextLine();
                System.out.println("How many of " + itemToRemove + " do you want to remove");
                int removeQuan = scanner.nextInt();
                scanner.nextLine();

                if (shoppingCart.isEmpty()){
                    System.out.println("Shopping cart is empty");
                    scanner.nextLine();
                }
                else if (itemNamesPrices.containsKey(itemToRemove)) {
                    quantity = shoppingCart.get(itemToRemove);
                    while(removeQuan > quantity){
                        System.out.println("remove amount is greater than item quantity in cart, Please enter an appropriate amount:");
                        removeQuan = scanner.nextInt();
                        scanner.nextLine();
                    }

                    if (quantity == removeQuan){
                        shoppingCart.remove(itemToRemove);
                        System.out.println(itemToRemove+ " has been removed.");
                        totalQuantity = totalQuantity - removeQuan;
                        scanner.nextLine();
                    }else{
                        shoppingCart.put(itemToRemove, quantity - removeQuan);
                        totalQuantity = totalQuantity - removeQuan;
                        System.out.println(itemToRemove + " has been removed " + removeQuan + " times");
                        scanner.nextLine();
                    }
                }else {
                    System.out.println("Item entered is not in cart.");
                    scanner.nextLine();
                }
            }
            else if (itemNamesPrices.containsKey(userInput)) {
                System.out.println("How many of " + userInput + " do you want to add?");
                prodQuantity = scanner.nextInt();
                scanner.nextLine();
                shoppingCart.put(userInput, prodQuantity);
                totalQuantity += prodQuantity;
                System.out.println(userInput + " has been added to cart.");
            }else {
                System.out.println("This item is not available");
            }
        }

        System.out.println(totalQuantity);
        System.out.println(shoppingCart);
        Random rand = new Random();
        int orderID = rand.nextInt(1000);
        System.out.println("order ID: " + orderID);
        double totalInvoice = calcTotal(shoppingCart, itemNamesPrices);
        System.out.println("The total for your items today is $" + totalInvoice);

        String checkcardNum = "^[0-9]{16}$";
        Pattern cardNumPattern = Pattern.compile(checkcardNum);
        String checkexDate = "^[0-9]{2}+/[0-9]{2}+$";
        Pattern exDatePattern = Pattern.compile(checkexDate);
        System.out.println("name on card:");
        String nameonCard = scanner.nextLine();

        System.out.println("Card Number:");
        long cardNumber = scanner.nextLong();
        System.out.println("Expiration Date:");
        String exDate = scanner.nextLine();
        System.out.println("Security Code:");
        int secCode = scanner.nextInt();


            System.out.println("Thanks for for shopping with us");

        System.out.println("Order will be shipped to the following address on file:");
        System.out.println(currentCustFName +" "+ currentCustLName);
        System.out.println(currentCustaddress);
        System.out.println(currentCustCity + ", "+ currentCustState +" "+ currentCustZipCode);

        //sends transaction to the order table
        String insertOrderQuery = "INSERT INTO tblOrders (fldOrderId, fldCustomerId, fldItemsCount, fldOrderTotal) VALUES (?, ?, ?, ?)";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn =DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/vegan_foods_store","root","jemgum5d");

            PreparedStatement preparedStatement = conn.prepareStatement(insertOrderQuery);

            preparedStatement.setInt(1,orderID);
            preparedStatement.setInt(2,currentCustID);
            preparedStatement.setInt(3,totalQuantity);
            preparedStatement.setDouble(4,totalInvoice);

            preparedStatement.executeUpdate();

        }catch(Exception e){ System.out.println(e);}
    }


    // Methods beyond this point **************************************************************************************************************
    /**
     * method calcTotal gets
     * @param shopCart holds customer shopping items
     * @param itemPrices holds items names with prices
     * @return totalPrice
     */
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

    /**
     * method newCustSignUp lets the user register to our store
     */
    public static void newCustSignUp(){
        Scanner newCust = new Scanner(System.in);
        //Regular expressions
        String emailcheck = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        Pattern pattern = Pattern.compile(emailcheck);

        Random rand = new Random();
        int custID = rand.nextInt(1000);
        System.out.println("Please fill in the info needed: ");
        System.out.println("First Name: ");
        String fName = newCust.nextLine();
        System.out.println("Last Name: ");
        String lName = newCust.nextLine();
        System.out.println("Address: ");
        String address = newCust.nextLine();
        System.out.println("Address 2 (or null for no second address: ");
        String address2 = newCust.nextLine();
        System.out.println("City: ");
        String city = newCust.nextLine();
        System.out.println("State (Abbreviation only): ");
        String state = newCust.nextLine();
        while(state.length() > 2){
            System.out.println("Please only use the Abbreviation of the State:");
            state = newCust.nextLine();
        }
        System.out.println("Zip Code: ");
        String zipCode = newCust.nextLine();
        while(zipCode.length() > 5){
            System.out.println("Please enter only 5 digits");
            zipCode = newCust.nextLine();
        }
        System.out.println("Email: ");
        String email = newCust.nextLine();
        Matcher matcher = pattern.matcher(email);
        while (!matcher.matches()){
            System.out.println("Please input a valid email:");
            email = newCust.nextLine();
            matcher = pattern.matcher(email);
        }
        System.out.println("Phone Number: ");
        String phoneNum = newCust.nextLine();

        System.out.println("Your customer ID is "+ custID);
        int storeVisits = 0;

        //upload data into customer table in database
        String insertQuery = "INSERT INTO tblCustomers (fldCustomerId, fldFName, fldLName, fldAddress, fldAddress2, fldCity, fldState, fldZipCode, fldEmail, fldPhoneNumber, fldStoreVisits) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn =DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/vegan_foods_store","root","jemgum5d");

            PreparedStatement preparedStatement = conn.prepareStatement(insertQuery);

            preparedStatement.setInt(1,custID);
            preparedStatement.setString(2,fName);
            preparedStatement.setString(3,lName);
            preparedStatement.setString(4, address);
            preparedStatement.setString(5, address2);
            preparedStatement.setString(6, city);
            preparedStatement.setString(7, state);
            preparedStatement.setString(8, zipCode);
            preparedStatement.setString(9, email);
            preparedStatement.setString(10, phoneNum);
            preparedStatement.setInt(11, storeVisits);

            preparedStatement.executeUpdate();

        }catch(Exception e){ System.out.println(e);}
    }
}
