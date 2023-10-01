/**+ class VeganFoodsStore is the main class, where main functions occur
 * @ author Marcos, Joel, Cooper
 */
public class VeganFoodsStore {
    public static void main(String[] args){
        VeganEnergyDrink riotEnergy = new VeganEnergyDrink(1, "Riot Energy", "Riot Energy", 37.09, "Berry", 160, 16);
        VeganEnergyDrink guruEnergy = new VeganEnergyDrink(2, "Guru Organic", "Guru", 29.99, "Grape",142, 12);
        VeganEnergyDrink sambazonEnergy = new VeganEnergyDrink(3, "Acai Berry", "Sambozan", 31.59, "Passionfruit", 120, 12);
        VeganEnergyDrink zeviaEnergy = new VeganEnergyDrink(4, "Zevia Zero Calorie Energy", "Zevia", 24.98, "Watermelon", 120, 12);
        VeganEnergyDrink celsiusEnergy = new VeganEnergyDrink(5, "Celsius Live Fit Energy", "Celsius", 19.32, "Strawberry", 200, 12);
        VeganEnergyDrink odysseyEnergy = new VeganEnergyDrink(6, "Odyssey Sparkling Mushroom Elixir", "Odyssey", 41.99, "Orange Ginger", 85, 12);
        VeganBowl QuinoaBowl = new VeganBowl(7, "Quinioa and Broccoli", "House", 12.99, "Salt and Pepper", "Quinoa", "Broccoli" );
        VeganBowl riceBowl = new VeganBowl(8, "Rice and Beans", "House", 13.99, "Salt, Pepper, Thyme, Cumin and Chili Powder", "Quinoa", "Broccoli" );
        VeganMeat phillySteakPieces = new VeganMeat(9, "PAOW PhillyPieces", "POAW", 21.99, "Steak", 90 );
        VeganMeat veggieBurger = new VeganMeat(10, "Organic Black Bean Veggie Burger", "Amy's", 23.99, "Black Bean", 130);
        VeganChips beanChips = new VeganChips(11, "Beanfields Bean Chips", "Beanfields", 10.99, "nacho", 130);
        VeganChips veggieChips = new VeganChips(12, "Veggie Chips", "Nuts", 9.99, "vegtable asortment", 196);

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

        //list all items in inventory with price and brand
        inventory.listAllItems();
    }
}
