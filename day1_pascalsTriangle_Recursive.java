import java.util.Scanner;

public class RecursionPascalTriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("No of rows: ");
        int rows = sc.nextInt();

        for(int i=0; i<rows; i++) {
            for(int j = 0; j<=i; j++) {
                System.out.print(pascalTriangle(i, j) + " ");
            }
            System.out.println();
        }
    }
    public static int pascalTriangle(int row, int col) {
        if(col== 0 || col== row) {
            return 1;
        } 
        else {
            return pascalTriangle(row - 1, col - 1) + pascalTriangle(row - 1, col);
        }
    }
}
