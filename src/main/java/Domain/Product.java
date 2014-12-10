/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Domain;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jesse
 */

@XmlRootElement
public class Product {
    
    private int id;
    private String naam;
    private double prijs;
    private int voorradig;
    
    public Product(String naam, double prijs, int voorradig) {
        this.naam = naam;
        this.prijs = prijs;
        this.voorradig = voorradig;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public int getVoorradig() {
        return voorradig;
    }

    public void setVoorradig(int voorradig) {
        this.voorradig = voorradig;
    }    
    
}
