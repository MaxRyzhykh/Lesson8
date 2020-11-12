package academy.belhard;

public class Address {
    private String city;
    private String street;
    private int houseNumb;

    public Address(String city, String street, int houseNumb) {
        this.city = city;
        this.street = street;
        this.houseNumb = houseNumb;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getHouseNumb() {
        return houseNumb;
    }

    @Override
    public String toString() {
        return  "city= " + city +
                ", street= " + street +
                ", houseNumb= " + houseNumb;
    }
}
