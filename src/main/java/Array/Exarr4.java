package Array;

public class Exarr4 {
    public static void main(String[] args) {
        int arr[] = {3, 2, 5, 6, 1};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
