package part1.lesson05.task01;

public class zadanie_3 {

    public static void main(String[] args)
    {
        toleft();


    }

    private static void toleft() {

        int[][] a = {{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10}};
        for ( int i =0; i<a.length;i++){
            for (int j=0;j<a[i].length;j++)
                if(j==a[i].length-1) {
                    System.out.print("0");
                }
                    else {
                    System.out.print(""+a[i][j+1]+ "\t");
                }
                System.out.println();
        }
    }
  }



//System.out.println(Arrays.deepToString(a));