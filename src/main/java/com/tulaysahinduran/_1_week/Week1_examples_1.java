package com.tulaysahinduran._1_week;

import java.util.Scanner;
/*
1. 1. Dereceden 1 Bilinmeyenli Denklemi Çözme (Scanner kullanlalım)
      Soru:
      Kullanıcıdan ax + b = 0 denklemindeki a ve b değerlerini alıp x'i hesaplayan programı yazınız.
      Çözüm:
 */

public class Week1_examples_1 {
    public static void main(String[] args) {
        //scanner
        Scanner scanner = new Scanner(System.in);

        //variable
        double aDegeri, bDegeri, sonuc;

        System.out.println("A değerini giriniz: ");
        aDegeri = scanner.nextDouble();

        System.out.println("B değerini giriniz: ");
        bDegeri = scanner.nextDouble();

        sonuc=(-bDegeri/aDegeri);

        System.out.println("sonuc: " +sonuc);
        scanner.close();


    }
}
