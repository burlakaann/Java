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
public class Zestaw666_1 {

    /**
     * @param args the command line arguments
     */       
    public static void main(String[] args) {
    //zad2: bląd kompilacji przez to że klasa Vehicle jest abstrakcyjna dla tego nie mozemy stworzyc jej obiekt    
        Product[] product = new Product[6];
        //product[0] = new Vehicle(1, "brand1 ", "model1 ");
        //product[1] = new Vehicle(2, "brand2 ", "model2 ");
        product[2] = new Car(3, "brand3 ", "model3 ","carBody3 ");
        product[3] = new Car(4, "brand4 ", "model4 ","carBody4 ");
        product[4] = new Motocykle(5, "brand5 ", "model5 ", "typeOfDrive5 ");
        product[5] = new Motocykle(6, "brand6 ", "model6 ", "typeOfDrive6 ");
        for(int i = 2; i < 6; i++){
            System.out.println(product[i]);
        }
    }
}
