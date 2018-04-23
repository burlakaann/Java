/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zestaw4;

/**
 *
 * @author Admin
 */
public class SzyfrCezara {
    private String alfabet;
    private String zmienionyAlfabet;
    SzyfrCezara(int klucz){
        alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        zmienionyAlfabet = alfabet.substring(klucz);
        zmienionyAlfabet = zmienionyAlfabet + alfabet.substring(0,klucz);
    }
    public String szyfruj(String wiadomosc){
        String upper = wiadomosc.toUpperCase();
        StringBuilder str = new StringBuilder(); 
        str.append(upper);
        for(int i = 0; i < str.length(); i++){
            if(alfabet.indexOf(str.charAt(i)) != -1){
                str.setCharAt(i,zmienionyAlfabet.charAt(alfabet.indexOf(str.charAt(i))));
            }
        }
        
      return str.toString();  
    }
}
