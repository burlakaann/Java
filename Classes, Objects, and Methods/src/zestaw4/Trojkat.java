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


public class Trojkat {
    
    private Punkt punkt1; 
    private Punkt punkt2; 
    private Punkt punkt3; 
    public double pole; 
    public double obwod; 
    private Odcinek o1; 
    private Odcinek o2; 
    private Odcinek o3; 

   private void set_o1(){
        o1 = new Odcinek(punkt1,punkt2);
    }
    
    private void set_o2(){
        o2 = new Odcinek(punkt2,punkt3);
    }
    
    private void set_o3(){
        o3 = new Odcinek(punkt1,punkt3);
    }
    
    public double getPole(){ 
        return pole; 
    } 
    public double getObwod(){ 
        return obwod; 
    } 
    
    public void setObwodPole(){ 
        obwod = o1.getDlugosc() + o2.getDlugosc() + o3.getDlugosc();
        
        double p = obwod / 2;
        
        pole = Math.sqrt(p*(p - o1.getDlugosc()) * (p - o2.getDlugosc()) * (p - o3.getDlugosc()));
    }   
    
    Trojkat(Punkt p1, Punkt p2, Punkt p3){
        punkt1 = new Punkt(p1.getX(),p1.getY());
        punkt2 = new Punkt(p2.getX(),p2.getY());
        punkt3 = new Punkt(p3.getX(),p3.getY());
    
        set_o1();
        set_o2();
        set_o3();
        setObwodPole();
    } 

    public void set_punkt1(Punkt punkt){
        punkt1 = punkt;
        
        setObwodPole();
        set_o1();
        set_o3();
    }
    
    public void set_punkt2(Punkt punkt){
        punkt2 = punkt;
        
        setObwodPole();
        set_o1();
        set_o2();
    }
    
    public void set_punkt3(Punkt punkt){
        punkt3 = punkt;
        
        setObwodPole();
        set_o2();
        set_o3();
    }
    
    public Punkt get_punkt1(){
        return punkt1;
    }
    
    public Punkt get_punkt2(){
        return punkt2;
    }
    
    public Punkt get_punkt3(){
        return punkt3;
    }
    
    public Odcinek get_ok1(){
        return o1;
    }
    
    public Odcinek get_o2(){
        return o2;
    }
    
    public Odcinek get_o3(){
        return o3;
    }
    
    public void wypisz(){
    
    System.out.println("punkt1: x = "+punkt1.getX()+" y = "+punkt1.getY()+'\n');
    System.out.println("punkt2: x = "+punkt2.getX()+" y = "+punkt2.getY()+'\n');
    System.out.println("punkt3: x = "+punkt3.getX()+" y = "+punkt3.getY()+'\n');
    
    System.out.println("Odcinek_1: punkt1,punkt2"+'\n'+"dlugosc = "+o1.getDlugosc()+'\n');
    System.out.println("Odcinek_2: punkt2,punkt3"+'\n'+"dlugosc = "+o2.getDlugosc()+'\n');
    System.out.println("Odcinek_3: punkt1,punkt3"+'\n'+"dlugosc = "+o3.getDlugosc()+'\n');
    
    System.out.println("obwod = "+obwod);
    System.out.println("pole = "+pole);
    }
    
     public String toSring(){
        String s;
        
        s = "[ p1["+ punkt1.getX() +"," + punkt1.getY() +"], " +"p2["+ punkt2.getX() + ","+ punkt2.getY() + ", p3["+punkt3.getX()+ ","+punkt3.getY()+"], obwod = "+getObwod() + ", pole = " + getPole()+"]";
        for(int i=0; i<50000; i++) {
            s=s+i;
        }
        return s;
        
    }
}