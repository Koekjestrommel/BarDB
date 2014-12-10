/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Service;

import Domain.Product;
import java.util.ArrayList;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 *
 * @author Jesse
 */

@Singleton
@Startup
public class BestellingService {
    
    ArrayList<Product> producten = new ArrayList<>();
    
    private void initProducten(){
        producten.add(new Product(1, "Cola", 2.00d, 50));
        producten.add(new Product(2, "Fanta", 2.00d, 50));
        producten.add(new Product(3, "Tosti", 2.10d, 50));
        producten.add(new Product(4, "Koffie", 1.80d, 50));
        producten.add(new Product(5, "Tomatensoep", 4.00d, 50));
        producten.add(new Product(6, "Bier", 2.50d, 50));
    }
}
