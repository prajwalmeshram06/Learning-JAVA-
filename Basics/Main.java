import java.util.Scanner;
import java.util.HashMap;
import java.io.*;

public class Main {
    static void inputMatrix(int[][] matrix, int row, int column, Scanner sc) {
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }
    static void daigonalElements(int[][] matrix, int row, int column) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if(i == j) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
           
        }
    }

    static void rowSum(int[][] matrix, int row, int column) {
        for(int i = 0; i < row; i++) {
            int sum = 0;
            for(int j = 0; j < column; j++) {
                sum += matrix[i][j];
            }
            System.out.println("Sum of " + i + "is" + sum);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // int row = 3;
        // int column = 3;
        // int[][] matrix = new int[row][column];
        // inputMatrix(matrix, row, column, sc);
        // daigonalElements(matrix, row, column);
        // rowSum(matrix, row, column);

        // String s = "hello";
        // int n = s.length();
        // System.out.print(s.charAt(0));
        // System.out.println();
        // System.out.print(n);
        // System.out.println();
        // System.out.print(s.equals("hello"));
        // System.out.println();
        // System.out.print(s.substring(4));
        // System.out.println(s.toUpperCase());
        // System.out.println(s.contains("ll"));
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = {1,2,2,3,3,1};
        for(int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (int key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
        

        sc.close();
    }
}