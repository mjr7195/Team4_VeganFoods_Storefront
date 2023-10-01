/**+ class used to create objects of vegan chips
 * @ author Joel
 */
class VeganChips extends VeganFoodItem {
    /**+
     * The calorieAmount holds the calorie each item has
     */
    private int calorieAmount;

    /**+
     * constructor VeganChips creates class of vegan chips
     * @param id vegan chips ID
     * @param name vegan chips name
     * @param brand vegan chips brand
     * @param price vegan chips price
     * @param flavor vegan chips flavor
     * @param calorieAmount vegan chips calorie amount
     */
    /** constructor method for vegan chips */
    public VeganChips(int id, String name, String brand, double price, String flavor, int calorieAmount){
        super(id, name, brand, price, flavor);
        this.setCalorieAmount(calorieAmount);
    }

    /**+
     * getter method for calorieAmount
     * @return calorieAmount
     */
    public int getCalorieAmount() {return calorieAmount; }

    /**+
     * setter method for calorieAmount
     * @param calorieAmount calorie amount for product
     */
    public void setCalorieAmount(int calorieAmount) { this.calorieAmount = calorieAmount; }

}



