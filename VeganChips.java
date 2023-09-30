class VeganChips extends VeganFoodItem {

    private int calorieAmount;

    public VeganChips(int id, String name, String brand, double price, String flavor, int calorieAmount){
        super(id, name, brand, price, flavor);
        this.setCalorieAmount(calorieAmount);
    }
    public int getCalorieAmount() {return calorieAmount; }

    public void setCalorieAmount(int calorieAmount) { this.calorieAmount = calorieAmount; }

}



