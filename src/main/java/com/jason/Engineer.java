package com.jason;

//import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
//import jakarta.persistence.OneToOne;

import java.util.List;

@Entity
public class Engineer {

    @Id
    private int eid;
    private String eName;
    private String tech;

//    @Embedded
//    @OneToOne
//    private Laptop laptop;

//    @OneToMany(mappedBy = "engineer")
//    private List<Laptop> laptops;

    @ManyToMany
    private List<Laptop> laptops;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "eid=" + eid +
                ", eName='" + eName + '\'' +
                ", tech='" + tech + '\'' +
                ", laptops=" + laptops +
                '}';
    }
}
