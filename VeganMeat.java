/**+ class VeganMeat created to make vegan meat objects
 * @author Joel
 */
class VeganMeat extends VeganFoodItem {
    /**+
     * The calorieAmount holds the calories for the item
     */
    private double calorieAmount;

    /** Constructor method for vegan meat */
    public VeganMeat(int id, String name, String brand, double price, String flavor, double calorieAmount){
        super(id, name, brand, price, flavor);
        this.setCalorieAmount(calorieAmount);
    }

    /**+
     * getter method for calorieAmount
     * @return calorieAmount
     */
    public double getCalorieAmountAmount() {return calorieAmount; }

    /**+
     * setter method for calorieAmount
     * @param calorieAmount item calories
     */
    public void setCalorieAmount(double calorieAmount) { this.calorieAmount = calorieAmount;}
}
