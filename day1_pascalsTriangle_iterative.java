import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("No of rows: ");
        int nRows = sc.nextInt();

        int[][] trg=getPT(nRows);

        for(int row=0; row<nRows; row++) {
            for (int col=0; col<=row; col++) {
                System.out.print(trg[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] getPT(int nRows) {
        int[][] trg = new int[nRows][nRows];
        for (int row = 0; row < nRows; row++) {
            trg[row][0] = 1;
            trg[row][row] = 1;
        }

        for (int row=2; row<nRows; row++) {
            for (int col=1; col<row; col++) {
                trg[row][col] = trg[row-1][col-1] + trg[row-1][col];
            }
        }
    return trg;
    }
}


output:
No of rows: 4
1 
1 1 
1 2 1 
1 3 3 1 
