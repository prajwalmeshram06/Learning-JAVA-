import java.util.*;

public class qus4 {

    static void inputMatrix(int[][] matrix, int row, int column, Scanner sc) {
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }
    static void Display(int[][] matrix, int row) {
        System.out.println("Matrix :");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < row; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    static void Transpose(int[][] matrix, int row) {

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < row; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }

    static void Determinant2x2(int[][] matrix, int row) {
        if(row != 2) {
            System.out.println("Matrix is not 2x2");
            return;
        }
        System.out.println((matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]));
    }

    static void Determinant3x3(int[][] matrix, int row) {
        if(row != 3) {
            System.out.println("Matrix is not 3x3");
            return;
        }
        System.out.println((matrix[0][0] * ((matrix[1][1] * matrix[2][2]) - (matrix[1][2] * matrix[2][1])) -  matrix[0][1] * ((matrix[1][0] * matrix[2][2]) - (matrix[1][2] * matrix[2][0])) + matrix[0][2] * ((matrix[1][0] * matrix[2][1]) - (matrix[1][1] * matrix[2][0]))));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int row = sc.nextInt();
        System.out.println("Enter Elements in Matrix : ");
        int[][] matrix = new int[row][row];
        inputMatrix(matrix, row, row, sc);

        
        while(true) {

            System.out.println("Menu => ");
            System.out.println("Display => 1");
            System.out.println("Transpose => 2");
            System.out.println("Determinant => 3");
            System.out.println("Exit Menu => -1");

            int choice = sc.nextInt();
            if(choice == -1) {
                break;
            }

            switch (choice) {
            case 1 -> Display(matrix, row);
            case 2 -> Transpose(matrix, row);
            case 3 -> Determinant2x2(matrix, row);
            case 4 -> Determinant3x3(matrix, row);
            }
        }

        sc.close();
    }
}
