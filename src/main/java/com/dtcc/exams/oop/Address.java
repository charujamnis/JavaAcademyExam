package com.dtcc.exams.oop;

public class Address {
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String zipcode;
    public Address() {
        this("","","","","");
    }

    /**
     * @param addressLine1 - first address line
     * @param addressLine2 - second address line
     * @param city - city of location
     * @param state - state of city
     * @param zipcode - zipcode of region
     */
    public Address(String addressLine1, String addressLine2, String city, String state, String zipcode) {
        this.addressLine1=addressLine1;
        this.addressLine2=addressLine2;
        this.city=city;
        this.state=state;
        this.zipcode=zipcode;
    }

    public String getAddressLine1() {
        return this.addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1=addressLine1;
    }

    public String getAddressLine2() {
        return this.addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2=addressLine2;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city=city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state=state;
    }

    public String getZipcode() {
        return this.zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode=zipcode;
    }

    @Override
    public boolean equals(Object o) {
       // if(o==this){return true;}
        if(!(o instanceof Address)) {return false;}
        Address a = (Address)o;
        return addressLine1.equals(a.addressLine1)
                && addressLine2.equals(a.addressLine2)
                && city.equals(a.city)
                && state.equals(a.state)
                && zipcode.equals(a.zipcode);
    }

    public String toString(){
        return "Address{addressLine1='"+this.addressLine1+"', addressLine2='"+this.addressLine2+"', city='"+this.city+
                "', state='"+this.state+"', zipcode='"+this.zipcode+"'}";
    }
}
