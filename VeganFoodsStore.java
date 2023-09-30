public class VeganFoodsStore {
    public static void main(String[] args){
        //create store objects
        VeganEnergyDrink riotEnergy = new VeganEnergyDrink(1, "Riot Energy", "Riot Energy", 37.09, "Berry", 160, 16);

        //add vegan Items to store inventory
        VeganFoodInventory inventory = new VeganFoodInventory();
        inventory.addVeganItem(riotEnergy);

        //list all items in inventory with price and brand
        inventory.listAllItems();
    }
}
