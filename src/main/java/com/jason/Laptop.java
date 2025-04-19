package com.jason;

//import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//@Embeddable
@Entity
public class Laptop {
    @Id
    private int lid;
    private String brand;
    private String Modal;
    private int Ram;

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

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
                "lid=" + lid +
                ", brand='" + brand + '\'' +
                ", Modal='" + Modal + '\'' +
                ", Ram=" + Ram +
                '}';
    }
}
