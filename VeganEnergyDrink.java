/**+ class VeganEnergyDrink creates constructor for vegan energy drinks
 * @author Marcos
 */
class VeganEnergyDrink extends VeganFoodItem {
    /**+
     * The caffeineAmount holds the caffeine amount in energy drink
     * The size holds how much drink is in the can
     */
   private int caffeineAmount;
   private double size;

   /** Constructor method for the VeganEnergyDrink */
   public VeganEnergyDrink(int id, String name, String brand, double price, String flavor, int caffeineAmount, double size){
       super(id, name, brand, price, flavor);
       this.setCaffeineAmount(caffeineAmount);
       this.setSize(size); // in oz
   }

    /**+
     * method getCaffeineAmount gets the caffeine amount in energy drink
     * @return caffeineAmount
     */
    public int getCaffeineAmount() {
        return caffeineAmount;
    }

    /**+
     * method setCaffeineAmount sets the caffeine amount of item
     * @param caffeineAmount caffeine amount for item
     */
    public void setCaffeineAmount(int caffeineAmount) {
        this.caffeineAmount = caffeineAmount;
    }

    /**+
     * method getSize gets the size of the energy drink
     * @return size
     */
    public double getSize() {
        return size;
    }

    /**+
     * method setSize sets the size of the energy drink in ounces
     * @param size item size
     */
    public void setSize(double size) {
        this.size = size;
    }
}
