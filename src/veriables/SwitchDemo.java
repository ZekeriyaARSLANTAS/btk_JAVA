package veriables;

public class SwitchDemo {
    public static void main(String[] args) {
        char grade = 'Z';


        switch (grade) {
            case 'A':
                System.out.println("mükemmel : Geçti");
                break;
            case 'B':
                System.out.println("Çok Güzel : Geçtiniz");
                break;
            case 'C':
                System.out.println("İyi : Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena Degil : Geçtiniz");
                break;
            case 'F':
                System.out.println("Maalesef : Kaldınız");
                break;
            default:
                System.out.println("Gecersiz not girdiniz");

        }
    }
}
