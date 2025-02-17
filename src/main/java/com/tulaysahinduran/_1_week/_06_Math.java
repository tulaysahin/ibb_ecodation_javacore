package com.tulaysahinduran._1_week;

public class _06_Math {
    public static void main(String[] args) {
        //NaN =Not a number
        System.out.println("Enküçük : "+Math.min(3,10));
        System.out.println("Enbüyük : "+Math.max(3,10));
        System.out.println("Mutlak : "+Math.abs(-10));
        System.out.println("Karekök : "+Math.sqrt(25));
        System.out.println("Karekök : "+Math.sqrt(-25));//NaN Not a number dönecek
        System.out.println("Karekök : "+Math.sqrt(Math.abs(-25)));
        System.out.println("Üslü Sayı : "+Math.pow(2,5)); //2 üstü 5
        System.out.println("Alta yuvarla : "+Math.floor(2.9)); // 2 olur
        System.out.println("üste yuvarla : "+Math.ceil(2.1)); // 3 olur
        System.out.println("ortalama yuvarla : "+Math.round(3.4)); //aşağıya yuvarlar 3
        System.out.println("ortalama yuvarla : "+Math.round(3.5)); //yukarıya yuvarlar 4

        System.out.println("Trigonemtri Sinüs: " +Math.sin(1));
        System.out.println("Trigonemtri cosinüs: " +Math.cos(1));
        System.out.println("Trigonemtri tan: " +Math.tan(1));
        System.out.println("Trigonemtri A Sinüs: " +Math.asin(1));

        System.out.println("PI Sayısı: " +Math.PI);
        System.out.println("E Sayısı: " +Math.E);

    }
}
