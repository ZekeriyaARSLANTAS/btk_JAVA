package veriables;

public class ArraysDemo {
    public static void main(String[] args) {
        String ogrenci1 = "Engin";
        String ogrenci2 = "Tengin";
        String ogrenci3 = "Dengin";
        String ogrenci4 = "Zengin";


        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("============");

        String [] ogrenciler = new String[4];
        ogrenciler [0]="Engin";
        ogrenciler [1]="Tengin";
        ogrenciler [2]="Dengin";
        ogrenciler [3]="Zengin";


        for (int i = 0; i <ogrenciler.length ; i++) {
            System.out.println(ogrenciler[i]);
        }

        System.out.println("=========");
        for(String ogrenci:ogrenciler){
            System.out.println("ogrenci = " + ogrenci);
        }

    }
}
