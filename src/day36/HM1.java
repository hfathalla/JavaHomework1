package day36;

import java.util.ArrayList;

public class HM1 {
    //TODO TRY CATCH HOMEWORK
    // 1. use string "HelloWorld" and get char at index 100
    // 2. create array of size 10, create a loop from 0 to 100, and try to print every element in array

}
     //1
  class Catch {
    public static void main(String[] args) {
        String a = "HelloWorld";
        try {
            a.charAt(100);
        } catch (Exception ex) {
            ex.printStackTrace();

        }
        //2

        int[] arr = new int[10];
    try{
       int b = arr[100];
    }catch (Exception ex){
        ex.printStackTrace();
    }

        

    }
}