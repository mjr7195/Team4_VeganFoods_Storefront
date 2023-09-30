public class VeganBowl extends VeganFoodItem{

    private String base;
    private String topping;

    public VeganBowl(int id, String name, String brand, double price, String flavor, String base, String topping){
        super(id, name, brand, price, flavor);
        this.base = base;
        this.topping = topping;
    }

    public String getBase() {return base; }
    public String getTopping() {return topping; }

    public void setBase(String base) { this.base = base;}
    public void setTopping(String topping) { this.topping = topping;}
}

