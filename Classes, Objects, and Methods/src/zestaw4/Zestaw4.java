/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zestaw4;
/*Jakie wartości będą posiadały pola obiektu sam po utworzeniu go w metodzie main klasy,
*korzystając z konstruktora opisanego powyżej?
*ciezar(700), wysokosc(1.4), aktualna_predkosc(0).
*Czy można wywołać konstuktor domyślny , gdy utworzyliśmy już „własny” konstuktor klasy?
*Można.
*Jakie wartości miałyby pola obiektu sam przy wywolaniu konsturktora domyslnego ?
*ciezar(0), wysokosc(0), aktualna_predkosc(0).
*Co stanie się jeżeli ustawimy modyfikatory dostepu pól klasy Samochod jako prywatne i będziemy chcieli wyświetlić wartości tych pól w metodzie main klasy SamochodTest?
*Wystąpi brak dostępu do tych pól.
*Co należałoby dopisać do Klasy Samochod aby klasa zawierała atrybut typu Silnik?
*Utworzyć w klasie Samochód pole typu Silnik.


/**
 *
 * @author Ania
 */
public class Zestaw4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Punkt punkt;
        Odcinek o1, o2;
        Trojkat trojkat;
        Punkt p1, p2, p3;
        
        o1 = new Odcinek(4,4,8,8);
        o2 = new Odcinek(4,8,8,4);
        
        punkt = Odcinek.przeciecie(o1,o2);
        
        punkt.wypisz();
        
        p1 = new Punkt(1,1);
        p2 = new Punkt(6,4);
        p3 = new Punkt(4,12);
        
        trojkat = new Trojkat(p1, p2, p3);
        
        trojkat.wypisz();
        
        String s = new String();
        long start=System.currentTimeMillis();
        for(int i=0; i<50000; i++){
            s=s+i;
        }
        long stop=System.currentTimeMillis();
        System.out.println("Czas wykonania dla + (w milisekundach): "+(stop-start));
        
        long start2=System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(); 
        for(int i=0; i<50000; i++){
            sb.append(i);
        }
        long stop2=System.currentTimeMillis();
        System.out.println("Czas wykonania dla SB (w milisekundach): "+(stop2-start2));
        
        SzyfrCezara sc = new SzyfrCezara(10);

        String wiadomosc = "Co wolno Adminowi, to nie Uzytkownikowi";
        System.out.println(sc.szyfruj(wiadomosc));

        
        

    }
    
}
