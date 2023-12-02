/** class Customer makes the customer class.
 * @author Marcos
 */
public class Customer {
    /**
     * id stores the customer ID
     */
    private int id;
    /**
     * fName stores the customer first name
     */
    private String fName;
    /**
     * lName stores the customer last name
     */
    private String lName;
    /**
     * address stores the customer address
     */
    private String address;
    /**
     * address2 stores the option second address of the customer
     */
    private String address2;
    /**
     * city stores the customers city
     */
    private String city;
    /**
     * state stores the customer state
     */
    private String state;
    /**
     * zipCode stores the customer zip code
     */
    private String zipCode;
    /**
     * email stores the customer email
     */
    private String email;
    /**
     * phoneNum stores the customers phone number
     */
    private String phoneNum;
    /**
     * storeVisits stores the customers visit amount
     */
    private int storeVisits;

    /**+
     * Constructor method Customer creates customer object
     * @param id Customer id
     * @param fName Customer first name
     * @param lName Customer last name brand
     * @param address Customer address
     * @param address2 Customer second address
     * @param city Customer city
     * @param state Customer state
     * @param zipCode Customer zipcode
     * @param email Customer email
     * @param phoneNum Customer phone number
     * @param storeVisits Customer store visits
     */
    public Customer(int id, String fName, String lName, String address, String address2, String city, String state, String zipCode, String email, String phoneNum, int storeVisits){
        this.setId(id);
        this.setfName(fName);
        this.setlName(lName);
        this.setAddress(address);
        this.setAddress2(address2);
        this.setCity(city);
        this.setState(state);
        this.setZipCode(zipCode);
        this.setEmail(email);
        this.setPhoneNum(phoneNum);
        this.setStoreVisits(storeVisits);

    }
    /**+
     * method getId gets the customer ID
     * @return id
     */
    public int getId() {
        return id;
    }
    /**+
     * method setId sets the customer ID
     * @param id customer id
     */
    public void setId(int id) {
        this.id = id;
    }
    /**+
     * method getfName gets the Customer first name
     * @return fName
     */
    public String getfName() {
        return fName;
    }

    /**
     * method setFname sets the customer first name
     * @param fName customer first name
     */
    public void setfName(String fName) {
        this.fName = fName;
    }

    /**
     * method getlName gets the customer last name
     * @return lName customer last name
     */
    public String getlName() {
        return lName;
    }

    /**
     * method setlName sets the customer last name
     * @param lName customer last name
     */
    public void setlName(String lName) {
        this.lName = lName;
    }

    /**
     * method getAddress gets the customer address
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * method setAddress sets the customer address
     * @param address Customer address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * method getAddress2 gets the customer second address
     * @return address2
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * method setAddress2 sets the customer second
     * @param address2 Customer second address
     */
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    /**
     * method getCity gets the customer city
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * method setCity sets the customer city
     * @param city Customer city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * method getState gets the customer state
     * @return state
     */
    public String getState() {
        return state;
    }

    /**
     * method setState sets the customer state
     * @param state Customer state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * method getZipCode gets the customer Zipcode
     * @return zipCode
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * method setZipCode sets the customer zip code
     * @param zipCode Customer zip code
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * method getEmail gets the customer email
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * method setEmail sets the customer email
     * @param email Customer email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * method getPhoneNum gets the customer phone number
     * @return phoneNum
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * method setPhoneNUm sets the customer phone number
     * @param phoneNum Customer phone number
     */
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    /**
     * method getStoreVisits gets the customer store visits
     * @return storeVisits
     */
    public int getStoreVisits() {
        return storeVisits;
    }

    /**
     * method setStoreVisits sets the customer store visits
     * @param storeVisits Customer store visits
     */
    public void setStoreVisits(int storeVisits) {
        this.storeVisits = storeVisits;
    }
}
