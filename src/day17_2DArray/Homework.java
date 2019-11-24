package day17_2DArray;

public class Homework {
    //part4, as homework
    //USING TWO LOOP print names and surnames
    //ex:
    //Bayram Guney
    //Micheal Jackson
    public static void main(String[] args) {
        //part1
        String[][] arr = {
                //   0         1         2           3            4
                {"Bayram", "Zeynep", "Sezai", "Micheal", "Baraka"}, //0. row
                {"Guney", "Ucar", "Kalayci", "Jackson", "Obama"},   //1. row
        };
//        System.out.println(arr[0][0]+ " "+ arr[1][0]);
//        System.out.println(arr[0][3]+ " "+ arr[1][3]);
//        System.out.println(arr[0][1]+ " "+ arr[1][1]);
//        System.out.println(arr[0][2]+ " "+ arr [1][2]);
//        System.out.println(arr[0][4]+ " "+arr[1][4]);

        for (int i = 0; i < arr[0].length; i++) {


                System.out.println(arr[0][i] +" "+ arr[1][i]);
            }

        }




    }





