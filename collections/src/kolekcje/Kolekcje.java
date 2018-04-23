/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolekcje;
import java.io.*;
import java.util.*;

/**
 *
 * @author Admin
 */
public class Kolekcje {
    
    /**
     * @param args the command line arguments
     */
    
    public static void zbiory(){
        Set <String> zbiorA = new HashSet<>(); 
        Set <String> zbiorB = new HashSet<>(); 
        int n = 0;
        String s = null;
        Scanner sc = new Scanner(System.in);
        char c = 0;
        
                while( n != 5){
                    System.out.println("Wybierz zbior A lub B");
                    
                    c = sc.next().charAt(0);
                    switch(c){
                        case 'A': {
                            System.out.println("wpisz cyfre:\n0-dodaj element\n1-usun element\n2-wylicz sume zbiorow\n3-wylicz roznice zbioerow\n4-wylicz iloczyn zbiorow\n5-koniec programu");
                            
                            n = sc.nextInt();
                            switch(n){
                            case 0: {
                                System.out.println("wpisz nazwe");
                                sc.nextLine();
                                s = sc.nextLine();
                                zbiorA.add(s);
                                System.out.println(s);
                            }
                            break;
                            case 1:{
                                System.out.println("wpisz nazwe");
                                sc.nextLine();
                                s = sc.nextLine();
                                zbiorA.remove(s);
                            }
                            break;
                            case 2: {
                                for (String st : zbiorA) {
                                    System.out.println(st);
                                }
                                for (String st : zbiorB){
                                    if( !zbiorA.contains(st) ){
                                        System.out.println(st);
                                    }
                                }
                                
                            }
                            break;
                            case 3:{
                                for (String st : zbiorA) {
                                    if( !zbiorB.contains(st) ){
                                        System.out.println(st);
                                    }
                                }
                            }
                            break;
                            case 4:{
                                for (String st : zbiorA) {
                                    if( zbiorB.contains(st) ){
                                        System.out.println(st);
                                    }
                                }
                            }
                            break;
                            
                        }
                    }break;
                        
                    case 'B': {
                        System.out.println("wpisz cyfre:\n0-dodaj element\n1-usun element\n2-wylicz sume zbiorow\n3-wylicz roznice zbioerow\n4-wylicz iloczyn zbiorow\n5-koniec programu");
                        
                        n = sc.nextInt();
                        switch(n){
                            case 0: {
                                System.out.println("wpisz nazwe");
                                sc.nextLine();
                                s = sc.nextLine();
                                zbiorB.add(s);
                                System.out.println(s);
                            }
                            break;
                            case 1:{
                                System.out.println("wpisz nazwe");
                                sc.nextLine();
                                s = sc.nextLine();
                                zbiorB.remove(s);
                            }
                            break;
                            case 2: {
                                for (String st : zbiorA) {
                                    System.out.println(st);
                                }
                                for (String st : zbiorB){
                                    if( !zbiorA.contains(st) ){
                                        System.out.println(st);
                                    }
                                }
                            }
                            break;
                            case 3:{
                                for (String st : zbiorB) {
                                    if( !zbiorA.contains(st) ){
                                        System.out.println(st);
                                    }
                                }
                            }
                            break;
                            case 4:{
                                for (String st : zbiorB) {
                                    if( zbiorA.contains(st) ){
                                        System.out.println(st);
                                    }
                                }
                            }
                            break;
                            
                        }
                    }break;
                }
                
            }
        }
    public static void main(String[] args) throws Exception {
        Set <Student> student = new HashSet<>(); 
        Set <Student> lhs = new LinkedHashSet<>(); 
        List<Student> list = new ArrayList<>();
        Student s1 = new Student("Anna", "Burlaka", 5, 5, 5);
        Student s2 = new Student("Maria", "Curie", 5, 5, 5);
        Student s3 = new Student("Adam", "Koza", 2, 2, 2);
        Student s4 = new Student("Andzej", "Chińczyk", 2, 3, 2);
        Student s5 = new Student("Mikołaj", "Kopernik", 5, 5, 5);
        student.add(s1);
        student.add(s2);
        student.add(s3);
        student.add(s4);
        student.add(s5);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        lhs.add(s1);
        lhs.add(s2);
        lhs.add(s3);
        lhs.add(s4);
        lhs.add(s5);
        for (Student s : student) {
            System.out.println(s);
        }
        for (Student stud : lhs) {
            System.out.println(stud);
        }
        Iterator <Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        /* w kolekcji ArrayList elementy przechowuja sie w liscie i w odroznieniu od setow(HashSet, LinkedHashSet) moga sie powtarzac.
           w LinkedHashSet w odroznieniu od HashSet mozemy iterowac w okreslonej kolejnosci.
        */
        Collections.sort(list);
        for ( Student s : list){
            System.out.println(s);
        }
        
        //String nazwaPliku = "\"C:\\Users\\Admin\\Desktop\\test.txt\"";
        //ObjectOutputStream out = new ObjectOutputStream(
        //                       new BufferedOutputStream(
        //                         new FileOutputStream(nazwaPliku)));
        //out.writeObject(list);
        //out.close();
        zbiory();
        
    }
}
