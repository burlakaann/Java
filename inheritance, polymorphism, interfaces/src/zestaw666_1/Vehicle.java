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
public abstract class Vehicle extends Product implements VehicleInterface{
    public String brand;
    public String model;

    public Vehicle(double price, String brand, String model) {
        super(price);
        this.brand = brand;
        this.model = model;
    }

    public double calculateBargainPrice() {
        return price - price*0.05;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setModel(String model){  
        this.model = model;
    }
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public String toString(){
        String s = "price: "+super.getPrice()+"brand: "+getBrand()+"model: "+getModel();
        return s;
    }
    
}