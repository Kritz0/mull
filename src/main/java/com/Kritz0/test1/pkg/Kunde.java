package com.Kritz0.test1.pkg;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name= "Kunde")
public class Kunde {
    private final String name;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String sname;
    private String lname;
    @OneToMany(
            mappedBy = "Kunde",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Rechnung> rechnung = new ArrayList<>();

    public Kunde(String name) {
        this.name = name;

    }


    public void setRechnung(List<Rechnung> rechnung){
        this.rechnung = rechnung;
    }

}
