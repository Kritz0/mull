package com.Kritz0.test1.pkg;

import javax.persistence.*;

@Entity
@Table(name = "Rechnung")
public class Rechnung {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int Rnr;
    private int Rbetr;
    private String datum;
    @ManyToOne
    @JoinColumn(name = "rechnung_id")
    private Kunde kunde;


    public Rechnung(Long id, Kunde kunde) {
        this.id = id;
        this.kunde = kunde;
    }

    public Rechnung() {

    }
}
