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

public class Odcinek {
    private Punkt punkt1; 
    private Punkt punkt2; 
    private double Dlugosc; 

    public Punkt getPunkt1(){ 
        return punkt1; 
    } 
    public Punkt getPunkt2(){ 
        return punkt2; 
    } 
    public double getDlugosc(){ 
        return Dlugosc; 
    } 
    public void setPunkt1(Punkt p){ 
        punkt1 = p; 
        setDlugosc(); 
    } 
    public void setPunkt2(Punkt p){ 
        punkt2 = p; 
        setDlugosc(); 
    } 
    private void setDlugosc(){ 
        Dlugosc = Math.sqrt((punkt1.getX() - punkt2.getX()) * (punkt1.getY() - punkt2.getX()) + (punkt1.getY() - punkt2.getY()) * (punkt1.getY() - punkt2.getY()) );
    } 
    Odcinek(Punkt p1, Punkt p2){ 
        punkt1 = p1; 
        punkt2 = p2; 
        setDlugosc();
    } 
    Odcinek(double x1, double y1, double x2, double y2){ 
        punkt1 = new Punkt(x1,y1); 
        punkt2 = new Punkt(x2,y2); 
        
        setDlugosc();
    } 
    public void wypisz(){
        System.out.println("punkt1: x = "+punkt1.getX()+" y = "+punkt1.getY());
        System.out.println("punkt2: x = "+punkt2.getX()+" y = "+punkt2.getY());
        System.out.println("dlugosc = " + Dlugosc);
    }
    static public Punkt przeciecie(Odcinek o1, Odcinek o2){
        Punkt punkt, z_p1, z_p2;
        double a1,a2,b1, b2, x, y;
        z_p1 = o1.getPunkt1();
        z_p2 = o1.getPunkt2();
        
        a1 = (z_p1.getY() - z_p2.getY()) / (z_p1.getX() - z_p2.getX());
        b1 = z_p1.getY() - a1 * z_p1.getX();
        
        z_p1 = o2.getPunkt1();
        z_p2 = o2.getPunkt2();
        
        a2 = (z_p1.getY() - z_p2.getY()) / (z_p1.getX() - z_p2.getX());
        b2 = z_p1.getY() - a2 * z_p1.getX();
        
        x = (b2 - b1) / (a1 - a2);
        y = a1 * x + b1;
        
        punkt = new Punkt(x,y);
        
        return punkt;
    }
    
    public String toSring(){
        String s;
        s = "[ p1["+ punkt1.getX() +"," + punkt1.getY() +"], " +"p2["+ punkt2.getX() + ","+ punkt2.getY() + "], dlugosc = "+getDlugosc() +"]";
        return s;
    }
}
   