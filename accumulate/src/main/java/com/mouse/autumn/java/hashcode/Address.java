package com.mouse.autumn.java.hashcode;

/**
 * @author wuhao Mahone Wu
 * @date 2018/8/12
 */
public class Address {

    private String address;

    private String phone;

    private String city;

    @Override
    public int hashCode() {
        return phone.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof  Address){
            Address address = (Address) obj;
            if(phone.equalsIgnoreCase(address.getAddress())){
                return true;
            }
        }
        return false;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Address{");
        sb.append("address='").append(address).append('\'');
        sb.append(", phone='").append(phone).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
