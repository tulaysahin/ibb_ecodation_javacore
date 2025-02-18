package com.tulaysahinduran._2_week;

import java.util.Scanner;

public class Week2_examples_1 {
    public static void main(String[] args) {
        Scanner klavye= new Scanner(System.in);

        System.out.println("pozitif Sayı Giriniz");
        int number=klavye.nextInt();

        // Validation
        // 1-) Kullanıcı pozitif bir sayı girmezse?
        // 2-) Kullanıcı harf girerse
        // 3-) Sıfır(Çift)
        // if (number<0){
        //    System.out.println("Sayınız Pozitif değil");

        if (number<0) {
            System.out.println("Sayınız negatif.");

        }
       if (number%2==0) {
            System.out.println("Sayınız çift");
        }else {
           System.out.println("Sayınız Tek");
       }


    }
}
