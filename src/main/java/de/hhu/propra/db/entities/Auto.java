package de.hhu.propra.db.entities;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Embeddable
public class Auto{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String marke;
    private String farbe;
    private double hubraum;
}