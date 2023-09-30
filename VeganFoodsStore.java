public class VeganFoodsStore {
    public static void main(String[] args){
        VeganEnergyDrink riotEnergy = new VeganEnergyDrink(1, "Riot Energy", "Riot Energy", 37.09, "Berry", 160, 16);
        VeganEnergyDrink guruEnergy = new VeganEnergyDrink(2, "Guru Organic", "Guru", 29.99, "Grape",142, 12);
        VeganEnergyDrink sambazonEnergy = new VeganEnergyDrink(3, "Acai Berry", "Sambozan", 31.59, "Passionfruit", 120, 12);
        VeganEnergyDrink zeviaEnergy = new VeganEnergyDrink(4, "Zevia Zero Calorie Energy", "Zevia", 24.98, "Watermelon", 120, 12);
        VeganEnergyDrink celsiusEnergy = new VeganEnergyDrink(5, "Celsius Live Fit Energy", "Celsius", 19.32, "Strawberry", 200, 12);
        VeganEnergyDrink OdysseyEnergy = new VeganEnergyDrink(6, "Odyssey Sparkling Mushroom Elixir", "Odyssey", 41.99, "Orange Ginger", 85, 12);

        //add vegan Items to store inventory
        VeganFoodInventory inventory = new VeganFoodInventory();
        inventory.addVeganItem(riotEnergy);

        //list all items in inventory with price and brand
        inventory.listAllItems();
    }
}
