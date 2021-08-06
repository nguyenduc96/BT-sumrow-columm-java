import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập kích thước cột : ");
        int sizeColumm = scanner.nextInt();
        System.out.print("Nhập kích thước hàng : ");
        int sizeRow = scanner.nextInt();
        double[][] array = createArray(sizeColumm, sizeRow);
        for (int i = 0; i < sizeColumm; i++) {
            for (int j = 0; j < sizeRow; j++) {
                System.out.print("Nhập giá trị tại " + i + " " + j + ":");
                array[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("Mảng : ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println("Bạn muốn tính tổng : ");
        System.out.println("1. Hàng");
        System.out.println("2. Cột");
        System.out.println("3. Exit");
        int choice = scanner.nextInt();
        do {
            switch (choice) {
                case 1: {
                    System.out.println("Chú ý chỉ số của hàng bắt đầu từ số 0");
                    System.out.println("Bạn chọn hàng số mấy : ");
                    int indexRow = scanner.nextInt();
                    System.out.println("Tổng các số ở hàng " + indexRow + " = " + sumRow(indexRow, array));
                    break;
                }
                case 2: {
                    System.out.println("Chú ý chỉ số của cột bắt đầu từ số 0");
                    System.out.println("Bạn chọn cột số mấy : ");
                    int indexColumm = scanner.nextInt();
                    System.out.println("Tổng các số ở cột " + indexColumm + " = " + sumColumm(indexColumm, array));
                    break;
                }
                case 3: {
                    System.out.println("Thoát vòng lặp");
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("Số chọn không hợp lệ mời chọn lại");
                }
            }
        } while (choice != 3);
    }

    public static double[][] createArray(int sizeColumm, int sizeRow) {
        double[][] array = new double[sizeColumm][sizeRow];
        return array;
    }

    public static double sumColumm(int indexColumm, double[][] array) {
        double sum = 0;
        for (int j = 0; j < array[indexColumm].length; j++) {
            sum += array[j][indexColumm];
        }
        return sum;
    }

    public static double sumRow(int indexRow, double[][] array) {
        double sum = 0;
        for (int j = 0; j < array.length; j++) {
            sum += array[indexRow][j];
        }
        return sum;
    }
}
