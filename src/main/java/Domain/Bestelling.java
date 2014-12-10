/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Domain;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jesse
 */

@XmlRootElement
public class Bestelling {
    
    int id;
    private int tafel;
    private ArrayList<Product> producten;
    private boolean betaald;
    
    public Bestelling(int tafel) {
        this.tafel = tafel;
        producten = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTafel() {
        return tafel;
    }

    public void setTafel(int tafel) {
        this.tafel = tafel;
    }
    
    public Product getProduct(String naam){
        for (Product p : producten) {
            if (p.getNaam().equals(naam)){
                return p;
            }
        }
        return new Product("Niets", 99.99d, 9999);
    }

    public boolean isBetaald() {
        return betaald;
    }

    public void setBetaald(boolean betaald) {
        this.betaald = betaald;
    }
    
    public void addProduct(String naam, double prijs, int voorradig){
        Product p = new Product(naam, prijs, voorradig);
        producten.add(p);
    }
    
}
