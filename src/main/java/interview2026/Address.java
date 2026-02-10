package interview2026;

public class Address {
    private int houseNo;
    private String street;
    private String landmark;

    public Address(int houseNo, String street, String landmark) {
        this.houseNo = houseNo;
        this.street = street;
        this.landmark = landmark;
    }

    public Address(Address address) {
        this.houseNo = address.houseNo;
        this.street = address.street;
        this.landmark = address.landmark;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseNo=" + houseNo +
                ", street='" + street + '\'' +
                ", landmark='" + landmark + '\'' +
                '}';
    }
}
