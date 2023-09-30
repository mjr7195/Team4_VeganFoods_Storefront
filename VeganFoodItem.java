class VeganFoodItem {
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

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
