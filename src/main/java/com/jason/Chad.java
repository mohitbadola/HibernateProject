package com.jason;

import jakarta.persistence.*;

@Entity
@Table(name = "chad_table")
public class Chad {
    @Id
    private int chadNo;
    @Column(name = "chad_name")
    private String cName;
    @Transient      //if u dont want this in  table
    private int cAge;

    public int getChadNo() {
        return chadNo;
    }

    public void setChadNo(int chadNo) {
        this.chadNo = chadNo;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public int getcAge() {
        return cAge;
    }

    public void setcAge(int cAge) {
        this.cAge = cAge;
    }

    @Override
    public String toString() {
        return "Chad{" +
                "chadNo=" + chadNo +
                ", cName='" + cName + '\'' +
                ", cAge=" + cAge +
                '}';
    }
}
