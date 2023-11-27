public class Customer {
    private int id;
    private String fName;
    private String lName;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;
    private String email;
    private String phoneNum;
    private int storeVisits;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getStoreVisits() {
        return storeVisits;
    }

    public void setStoreVisits(int storeVisits) {
        this.storeVisits = storeVisits;
    }
}
