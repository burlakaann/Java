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
public class Car extends Vehicle{
    public String carBody;
    public Car(double price, String brand, String model, String carBody) {
        super(price, brand, model);
        this.carBody = carBody;
    }
     
    public double calculateBargainPrice() {
        return  price - price*0.15;
    }
    public void setCarBody(String carBody){  
        this.carBody = carBody;
    }
    public String getCarBody(){
        return carBody;
    }
    public String toString(){
        String s = "carBody: "+getCarBody()+"price: "+super.getPrice()+"brand: "+super.getBrand()+"model: "+super.getModel();
        return s;
    }
}