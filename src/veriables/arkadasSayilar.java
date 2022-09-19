package veriables;

public class arkadasSayilar {
    public static void main(String[] args) {
        //220-284 arkadaş sayılar =>1 den başlayıp 220 ye kadar olan sayiların toplamı 284 e esit
        //                        =>1 den başlayıp 284 e kadar olan sayiların toplamı 220 ye esit
        int sayi1=220;
        int sayi2=284;
        int toplam1=0;
        int toplam2=0;
        for (int i = 1; i <sayi1 ; i++) {
            if (sayi1 % i == 0) {
                toplam1+=i;
            }
        }
            for (int i = 1; i <sayi2 ; i++) {
                if (sayi2 % i == 0) {
                    toplam2 +=i;
                }
            }
                if (sayi1==toplam2&&sayi2==toplam1){
                    System.out.println("bu iki sayi arkadastır");
                }else {
                    System.out.println("arkadas degildir");
                }
        }






    }

