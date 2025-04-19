package com.jason;

import jakarta.persistence.Embeddable;

@Embeddable
public class Laptop {

    private String brand;
    private String Modal;
    private int Ram;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModal() {
        return Modal;
    }

    public void setModal(String modal) {
        Modal = modal;
    }

    public int getRam() {
        return Ram;
    }

    public void setRam(int ram) {
        Ram = ram;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", Modal='" + Modal + '\'' +
                ", Ram=" + Ram +
                '}';
    }
}
