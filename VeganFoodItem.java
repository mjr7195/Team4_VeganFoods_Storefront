/**+ class VeganFoodItem is the parent class to all other object classes
 * @author Marcos
 */
class VeganFoodItem {
    /**+
     * The id stores the item ID
     * The name stores the item name
     * The brand stores the item company name
     * The price stores the item price
     * the flavor stores the item flavor
     */
   private int id;
   private String name;
   private String brand;
   private double price;
   private String flavor;

    /**+
     * method VeganFoodItem creates the default vegan food item
     * @param id food id
     * @param name food name
     * @param brand food brand
     * @param price food price
     * @param flavor food flavor
     */
   public VeganFoodItem(int id, String name, String brand,  double price, String flavor){
       this.setId(id); // same as this.id = id
       this.setName(name); // same as this.name = name
       this.setBrand(brand); // same as this.brand = brand
       this.setPrice(price); // same as this.price = price
       this.setFlavor(flavor); // same as this.flavor = flavor
   }
   /* *************** getters and setters *************** */

    /**+
     * method getId gets the item ID
     * @return id
     */
    public int getId() {
        return id;
    }

    /**+
     * method setId sets the item ID
     * @param id Item id
     */

    public void setId(int id) {
        this.id = id;
    }

    /**+
     * method getName gets the item name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**+
     * method setName sets the item name
     * @param name item name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**+
     * method getPrice gets the item price
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**+
     * method setPrice sets the item price
     * @param price item price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**+
     * method getFlavor gets item flavor
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    /**+
     * method setFlavor gets item flavor
     * @param flavor item flavor
     */
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    /**+
     * method getBrand gets the item brand
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**+
     * method setBrand sets the item brand
     * @param brand item brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }
}
