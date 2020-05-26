package br.com.sicredi.Utils;

import java.util.Objects;

public class Customer {

    private String firstName;
    private String lastName;
    private String contactFirstName;
    private String phone;
    private String addresLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String postalCode;
    private String country;
    private String employeer;
    private String creditLimit;

    public Customer(String firstName, String lastName, String contactFirstName, String phone, String addresLine1, String addressLine2, String city, String state, String postalCode, String country, String employeer, String creditLimit) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactFirstName = contactFirstName;
        this.phone = phone;
        this.addresLine1 = addresLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
        this.employeer = employeer;
        this.creditLimit = creditLimit;
    }

    public Customer(){ }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContactFirstName() {
        return contactFirstName;
    }

    public void setContactFirstName(String contactFirstName) {
        this.contactFirstName = contactFirstName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddresLine1() {
        return addresLine1;
    }

    public void setAddresLine1(String addresLine1) {
        this.addresLine1 = addresLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
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

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmployeer() {
        return employeer;
    }

    public void setEmployeer(String employeer) {
        this.employeer = employeer;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(String creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", contactFirstName='" + contactFirstName + '\'' +
                ", phone='" + phone + '\'' +
                ", addresLine1='" + addresLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", country='" + country + '\'' +
                ", employeer='" + employeer + '\'' +
                ", creditLimit='" + creditLimit + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return getFirstName().equals(customer.getFirstName()) &&
                getLastName().equals(customer.getLastName()) &&
                getContactFirstName().equals(customer.getContactFirstName()) &&
                getPhone().equals(customer.getPhone()) &&
                getAddresLine1().equals(customer.getAddresLine1()) &&
                getAddressLine2().equals(customer.getAddressLine2()) &&
                getCity().equals(customer.getCity()) &&
                getState().equals(customer.getState()) &&
                getPostalCode().equals(customer.getPostalCode()) &&
                getCountry().equals(customer.getCountry()) &&
                getEmployeer().equals(customer.getEmployeer()) &&
                getCreditLimit().equals(customer.getCreditLimit());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getContactFirstName(), getPhone(), getAddresLine1(), getAddressLine2(), getCity(), getState(), getPostalCode(), getCountry(), getEmployeer(), getCreditLimit());
    }
}
