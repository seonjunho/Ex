package Polymorphism;

import java.util.Arrays;

public class AdHoc {

    void sorting(int[] list){
        Arrays.parallelSort(list);
        System.out.println("Integer after sort :" + Arrays.toString(list));
    }
    void sorting(String[] names){
        Arrays.parallelSort(names);
        System.out.println("Nmaes after sort :"+ Arrays.toString(names));
    }

    public static void main(String[] args) {
        AdHoc obj = new AdHoc();
        int list[] = {2,3,4,1,5};
        obj.sorting(list);

        String[] names = {"rama", "girin", "hama"};
        obj.sorting(names);
    }
}

