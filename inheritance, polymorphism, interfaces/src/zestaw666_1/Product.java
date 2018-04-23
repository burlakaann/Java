/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zestaw666_1;

/**
 *
 * @author Admin
 */
public abstract class Product implements ProductInterface{
    public double price;
    public Product(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public Product() {}
    public abstract double calculateBargainPrice();
    
    public String toString(){
        String s = "price: "+getPrice();
        return s;
    }
}