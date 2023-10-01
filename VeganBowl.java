/**+ class VeganBowl creates constructor for vegan bowels
 * @author Cooper
 */
public class VeganBowl extends VeganFoodItem{

    /**
     * The base holds the base of the bowl
     * the topping holds the topping of the bowl
     */
    private String base;
    private String topping;

    /** Constructor method for the vegan bowl */
    public VeganBowl(int id, String name, String brand, double price, String flavor, String base, String topping){
        super(id, name, brand, price, flavor);
        this.base = base;
        this.topping = topping;
    }

    /**+
     * method getBase gets the base of the bowel
     * @return base
     */
    public String getBase() {return base; }

    /**+
     * method getTopping gets the topping of the bowl
     * @return topping
     */
    public String getTopping() {return topping; }

    /**+
     * method setBase sets the base of the bowl
     * @param base item base
     */
    public void setBase(String base) { this.base = base;}

    /**+
     * method setTopping sets the topping of the bowl
     * @param topping item topping
     */
    public void setTopping(String topping) { this.topping = topping;}
}

