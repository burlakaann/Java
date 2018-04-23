/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolekcje;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

/**
 *
 * @author Admin
 */
public class Student implements Comparable<Student>, Serializable {
    public String imie;
    public String nazwisko;

    public Map <String, Integer> mapa;
    //public int ocena1;
    //public int ocena2;
    //public int ocena3;
    
    public String getImie(){
        return imie;
    }
    public String getNazwisko(){
        return nazwisko;
    }
    /*public int getOcena1(){
        return ocena1;
    }
    public int getOcena2(){
        return ocena2;
    }
    public int getOcena3(){
        return ocena3;
    }
    */
    public int getOcena1(){
        return mapa.get("ocena1");
    }
    public int getOcena2(){
        return mapa.get("ocena2");
    }
    public int getOcena3(){
        return mapa.get("ocena3");
    }
    public Student(String imie, String nazwisko, int ocena1, int ocena2, int ocena3){
        this.imie = imie;
        this.nazwisko = nazwisko;
        mapa =  new HashMap<>();
        //this.ocena1 = ocena1;
        //this.ocena2 = ocena2;
        //this.ocena3 = ocena3;
        mapa.put("ocena1", ocena1);
        mapa.put("ocena2", ocena2);
        mapa.put("ocena3", ocena3);
    }
    
    @Override
    public String toString(){
        //return imie+" "+nazwisko+" "+ocena1+" "+ocena2+" "+ocena3;
        return imie+" "+nazwisko+" "+ mapa.get("ocena1")+" "+mapa.get("ocena2")+" "+mapa.get("ocena3");
    }
    //sort(a)
    /*
    public int compareTo(Student s) {
        int porownaneNazwiska = nazwisko.compareTo(s.nazwisko);
        if(porownaneNazwiska == 0) 
            return imie.compareTo(s.imie);
        else
            return porownaneNazwiska;
    }
    */
    //sort(b)
    @Override
    /*public int compareTo(Student s) {
        double a = (double)(ocena1+ocena2+ocena3)/3;
        double b = (double)(s.getOcena1()+s.getOcena2()+s.getOcena3())/3;
        if(a < b)
            return -1;
        else if(a == b)
            return 0;
        else
            return 1;
    }*/
    public int compareTo(Student s) {
        double a = (double)(mapa.get("ocena1")+mapa.get("ocena2")+mapa.get("ocena3"))/3;
        double b = (double)(s.getOcena1()+s.getOcena2()+s.getOcena3())/3;
        if(a < b)
            return -1;
        else if(a == b)
            return 0;
        else
            return 1;
    }   
}
