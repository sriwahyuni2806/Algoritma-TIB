/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author sri wahyuni
 */import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
    Scanner Input = new Scanner (System.in);
    double luassisi,volume,luas,akar;
    System.out.print("masukkan akar: ");
    luassisi=Input.nextDouble();
    akar=Math.sqrt(luassisi);
    System.out.println("akarnya adalah: "+akar);
    volume = akar*akar*akar;
    System.out.println("volumenya adalah: "+ volume);
    luas = 6*akar*akar;
    System.out.println("luasnya adalah: "+ luas);
    System.out.println("mencari luas dan volume balok");
    double p,l,t,luaspt,luasbalok, volumebalok;
    System.out.println("masukkan panjang balok");
    p=Input.nextDouble();
    System.out.println("masukkan lebar balok");
    l=Input.nextDouble();
    System.out.println("masukkan luaspt ");
    luaspt=Input.nextDouble();
    t=luaspt/1;
    System.out.println("tingginya adalah"+t);
    luasbalok=(2*p*t);
    System.out.println("luas balok adalah");
    volumebalok=p*l*t;
    System.out.println("volume balok adalah "+volumebalok);
    
    
    
    }
}
