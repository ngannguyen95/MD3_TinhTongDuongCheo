import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double[][] arr = createArr();
        double sum = 0;
        System.out.println("Nhập vào cột cần tính: ");

        // in ra ma trận
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j || i == arr.length - 1 - j) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Tổng đường chéo: " + sum);

    }

    static double[][] createArr() {
        System.out.println("Nhập số hàng: ");
        int row = scanner.nextInt();
        System.out.println("Nhập vào cột: ");
        int colum = scanner.nextInt();
        double[][] arr = new double[row][colum];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Nhập vào phần tử thứ: " + i + "." + j);
                arr[i][j] = scanner.nextInt();
            }
        }
        return arr;
    }
}