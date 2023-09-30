class VeganMeat extends VeganFoodItem {

    private double ouncesAmount;

    public VeganMeat(int id, String name, String brand, double price, String flavor, double ouncesAmount){
        super(id, name, brand, price, flavor);
        this.setCalorieAmount(ouncesAmount);
    }

    public double getOuncesAmount() {return ouncesAmount; }

    public void setCalorieAmount(double ouncesAmount) { this.ouncesAmount = ouncesAmount;}
}
