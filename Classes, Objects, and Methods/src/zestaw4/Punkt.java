/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zestaw4;
/**
 *
 * @author Ania
 */

public class Punkt { 
    private double X, Y; 
    public Punkt(double X, double Y){ 
        this.X = X; 
        this.Y = Y; 
    } 
    public double getX(){ 
        return X; 
    } 
    public double getY(){ 
        return Y; 
    } 
    public void setX(){ 
        this.X = X; 
    } 
    public void setY(){ 
        this.Y = Y; 
    } 
    public void wypisz(){
        System.out.println("x = "+X);
        System.out.println("y = "+Y);
    }
    
    public String toSring(){
        String s;
        s = "["+ getX() + "," + getY() + "]";
        return s;
    }
}
