package Nks9;

public class Exe {
    public static void main(String[] args) {
        int[] Arr = {1, 2, 3, 4, 5};
        int[] tmp = new int[10];

        for(int i = 0 ; i < Arr.length; i++)
            for (int j = 0; j < Arr.length; j++)
                tmp[i] = Arr[i];

        System.out.print("tmp :");
        for(int i = 0 ; i < 5; i++)
            System.out.print(tmp[i]+",");

//        System.out.print("Arr : ");
//        for(int i = 0 ; i < Arr.length; i++){
//            System.out.printf(Arr[i]+",");
//        }
//        System.out.printf("%nArr = tmp change Array%n");
//
//        for(int i = 0 ; i < Arr.length; i++) {
//            tmp[i] = Arr[i];
//        }
//        System.out.print("tmp : ");
//        for(int i = 0 ; i < 5; i++){
//            System.out.print(tmp[i]+",");
//        }
    }
}
