package veriables;

public class reCapDemo2 {
    public static void main(String[] args) {
        double[] myList={1.2,1.3,4.3,9.6};
        double total=0;
        double max=myList[0];
        for (double number:myList
             ) { if (max<number)
                 max=number;
            total+=number;
            System.out.println(number);

        }
        System.out.println("total = " + total);
        System.out.println("En Buyuk = " + max);

    }
}
