package com.jason;

//import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

//@Embeddable
@Entity
public class Laptop {
    @Id
    private int lid;
    private String brand;
    private String Modal;
    private int Ram;

    @ManyToOne
    private Engineer engineer;

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

    public Engineer getEngineer() {
        return engineer;
    }

    public void setEngineer(Engineer engineer) {
        this.engineer = engineer;
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
