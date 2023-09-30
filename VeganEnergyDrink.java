class VeganEnergyDrink extends VeganFoodItem {
   private int caffeineAmount;
   private double size;

   public VeganEnergyDrink(int id, String name, String brand, double price, String flavor, int caffeineAmount, double size){
       super(id, name, brand, price, flavor);
       this.setCaffeineAmount(caffeineAmount);
       this.setSize(size); // in mg
   }

    public int getCaffeineAmount() {
        return caffeineAmount;
    }

    public void setCaffeineAmount(int caffeineAmount) {
        this.caffeineAmount = caffeineAmount;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
