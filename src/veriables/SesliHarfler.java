package veriables;

public class SesliHarfler {
    public static void main(String[] args) {
        char harf = 'A';
        switch (harf) {
            case ('Z'): {
                System.out.println("Kalın sesli harf");
            }
            case ('E'): {
                System.out.println("İnce sesli harf");
            }
            case ('I'): {
                System.out.println("Kalın sesli harf");
            }
            case ('İ'): {
                System.out.println("İnce sesli harf");
            }
            case ('O'): {
                System.out.println("Kalın sesli harf");
            }
            case ('Ö'): {
                System.out.println("İnce sesli harf");
            }
            break;
            default:
                System.out.println("Sesli harf degil");


        }


    }
}
