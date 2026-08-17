import java.util.*;

public class qus3 {

    static void inputMatrix(int[][] matrix, int row, int column, Scanner sc) {
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }
    static void addition(int[][] matrix, int row, int column, int[][] matrix1, int row1, int column1) {

        if((row != row1) || (column != column1)) {
            System.out.println("Addition not POSSIBLE");
        } 

        for (int i = 0; i < row; i++) {
            
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + matrix1[i][j] + " ");
            }
        System.out.println();
           
        }
    }


    static void subtraction(int[][] matrix, int row, int column, int[][] matrix1, int row1, int column1) {

        if((row != row1) || (column != column1)) {
            System.out.println("Addition not POSSIBLE");
        } 

        for (int i = 0; i < row; i++) {
            
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] - matrix1[i][j] + " ");
            }
        System.out.println();
        }
    }

    static void Multiplication(int[][] A, int r1, int c1, int[][] B, int r2, int c2) {
        if (c1 != r2) {
            System.out.println("Multiplication not possible");
            return;
        }

        int[][] C = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows : ");
        int row = sc.nextInt();
        System.out.println("Enter ColumnS : ");
        int column = sc.nextInt();
        int[][] matrix = new int[row][column];
        System.out.println("Enter elements in Matrix :");
        inputMatrix(matrix, row, column, sc);
        System.out.println("Enter rows : ");
        int row1 = sc.nextInt();
        System.out.println("Enter ColumnS : ");
        int column1 = sc.nextInt();
        int[][] matrix1 = new int[row1][column1];
        System.out.println("Enter elements in Matrix :");
        inputMatrix(matrix1, row1, column1, sc);

        while(true) {
            System.out.println("Menu => ");
            System.out.println("Addition => 1");
            System.out.println("Subtraction => 2");
            System.out.println("Multiplication => 3");
            System.out.println("Exit Menu => -1");

            int choice = sc.nextInt();
            if(choice == -1) {
                break;
            }

            switch (choice) {
            case 1 -> addition(matrix, row, column, matrix1, row1, column1);
            case 2 -> subtraction(matrix, row, column, matrix1, row1, column1);
            case 3 -> Multiplication(matrix, row, column, matrix1, row1, column1);
            default -> System.out.println("Invalid Choice!");
            }
        }

        sc.close();
    }
}
