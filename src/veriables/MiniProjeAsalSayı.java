package veriables;

public class MiniProjeAsalSayı {
    public static void main(String[] args) {
        int number =1;
        int remainder=number%2;
        boolean isPrime=true;
      //  System.out.println(remainder);
        if (number==1){
            System.out.println("sayı asal degildir");return;
        }

        if (number<1){
            System.out.println("gecerli bir sayı girizi");
        }
        for (int i=2;i<number;i++){
            if(number%i==0){
                isPrime=false;
            }

        }
        if (isPrime){
            System.out.println("sayı asaldır");
        }else System.out.println("sayı asal degildir");
    }
}
