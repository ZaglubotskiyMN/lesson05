package part1.lesson05.task01;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        toLeft();

    }


    public static void toLeft(){

        int[][] a = {{0,2,3,4,5,6,7,8,9,10},{0,2,3,4,5,6,7,8,9,10}};


        for ( int i =0; i<a.length;i++){
            for (int j=0;j<a[i].length;j++)
           System.out.println(Arrays.deepToString(a));

        }


        //System.out.print(""+a[i][j]+ "");
        // System.out.println(a[0][4]);
        //System.out.print(Arrays.toString(a));













    }
}
