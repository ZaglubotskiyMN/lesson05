package part1.lesson05.task01;

public class Zadanie_2 {

    public static void main(String[] args)
    {
        toleft();

    }

    private static void toleft() {

        int[][] a = {{0,2,3,4,5,6,7,8,9,10},{0,2,3,4,5,6,7,8,9,10}};
        for ( int i =0; i<a.length;i++){
            for (int j=0;j<a[i].length-1;j++)
                System.out.print(""+a[i][j]+ "\t");

           //System.out.println(Arrays.deepToString(a));

        }
    }

}
// System.out.print(""+a[i][j]+ "");
