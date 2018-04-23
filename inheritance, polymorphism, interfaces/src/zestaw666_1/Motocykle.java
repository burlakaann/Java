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
public class Motocykle extends Vehicle {
    public String typeOfDrive;
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public Motocykle(double price, String brand, String model, String typeOfDrive) {
        super(price, brand, model);
        this.typeOfDrive = typeOfDrive;
    }
    
    public double calculateBargainPrice() {
       return price - price*0.1;
    }
    
    public void setTypeOfDrive(String typeOfrive){  
        this.typeOfDrive = typeOfrive;
    }
    public String getTypeOfDrive(){
        return typeOfDrive;
    }
    public String toString(){
        String s = "typeOf: "+getTypeOfDrive()+"price: "+super.getPrice()+"brand: "+super.getBrand()+"model: "+super.getModel();
        return s;
    }
}
